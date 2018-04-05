package com.pricing.engine.evaluator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.pricing.domain.CompetitorProductsPrice;
import com.pricing.domain.ProductSupplyDemandInformation;

public class ProductSeggregator {
	

	
	public void seggregateProductsList(List<ProductSupplyDemandInformation> productSupplyDemandInformationList, List<CompetitorProductsPrice> competitorProductsPriceList) {
		
		double flashDriveLeastCompetitorPrice = 0.0;
		double flashDriveMaxCompetitorPrice = 0.0;
		double flashDriveFiftyPercentAveragePrice = 0.0;
		double flashDriveAveragePrice = 0.0;
		double mp3playerAveragePrice = 0.0;
		double mp3playerFiftyPercentAveragePrice = 0.0;
		double mp3playerLeastCompetitorPrice = 0.0;
		double mp3playerMaxCompetitorPrice = 0.0;
		double ssdAveragePrice = 0.0;
		double ssdFiftyPercentAveragePrice = 0.0;
		double ssdLeastCompetitorPrice = 0.0;
		double ssdMaxCompetitorPrice = 0.0;
		
		List<Integer> priceList  =  new ArrayList<Integer>();
		List<CompetitorProductsPrice>  ssdCompetitorPriceList =  new ArrayList<CompetitorProductsPrice>();
		List<CompetitorProductsPrice>  flashdriveCompetitorPriceList =  new ArrayList<CompetitorProductsPrice>();
		List<CompetitorProductsPrice>  mp3playerCompetitorPriceList =  new ArrayList<CompetitorProductsPrice>();
	
		FilterProducts filterProducts = new FilterProducts();
		filterProducts.getFilteredProductList(competitorProductsPriceList, ssdCompetitorPriceList, flashdriveCompetitorPriceList,
				mp3playerCompetitorPriceList);
		
		AveragePriceCalculator  averagePriceCalculator =  new AveragePriceCalculator();
		FilterCompetitorPrice filterCompetitorPrice =  new FilterCompetitorPrice();
		MinMaxPrice minMaxPrice = new MinMaxPrice();
		ssdAveragePrice = averagePriceCalculator.getAveragePrice(ssdCompetitorPriceList);
		ssdFiftyPercentAveragePrice = ((ssdAveragePrice * 50)/100);
		List<CompetitorProductsPrice> finalFilteredSsdCompetitorPriceList = filterCompetitorPrice.getFilterCompetitorPrice(ssdCompetitorPriceList, ssdFiftyPercentAveragePrice);
		ssdLeastCompetitorPrice = minMaxPrice.getMinMaxPrice(averagePriceCalculator, ssdLeastCompetitorPrice,
				finalFilteredSsdCompetitorPriceList);
		

		System.out.println("ssdFiftyPercentAveragePrice  : "  + ssdFiftyPercentAveragePrice);
		flashDriveAveragePrice = averagePriceCalculator.getAveragePrice(flashdriveCompetitorPriceList);
		flashDriveFiftyPercentAveragePrice = ((flashDriveAveragePrice * 50)/100);
		List<CompetitorProductsPrice> finalFilteredFlashDriveCompetitorPriceList = filterCompetitorPrice.getFilterCompetitorPrice(flashdriveCompetitorPriceList, flashDriveFiftyPercentAveragePrice);
		flashDriveLeastCompetitorPrice = minMaxPrice.getMinMaxPrice(averagePriceCalculator, flashDriveLeastCompetitorPrice,
				finalFilteredFlashDriveCompetitorPriceList);
		
		mp3playerAveragePrice = averagePriceCalculator.getAveragePrice(mp3playerCompetitorPriceList);
		mp3playerFiftyPercentAveragePrice = ((mp3playerAveragePrice * 50)/100);
		List<CompetitorProductsPrice> finalFilteredMp3PlayerCompetitorPriceList = filterCompetitorPrice.getFilterCompetitorPrice(mp3playerCompetitorPriceList, mp3playerFiftyPercentAveragePrice);
		mp3playerLeastCompetitorPrice = minMaxPrice.getMinMaxPrice(averagePriceCalculator, mp3playerLeastCompetitorPrice,
				finalFilteredMp3PlayerCompetitorPriceList);
		
		ActualPrice actualPrice =  new ActualPrice();
		actualPrice.getActualPrice(productSupplyDemandInformationList, flashDriveLeastCompetitorPrice, mp3playerLeastCompetitorPrice,
				ssdLeastCompetitorPrice);
	
		
	}

}
