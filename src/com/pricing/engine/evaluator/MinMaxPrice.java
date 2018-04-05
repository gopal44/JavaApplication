package com.pricing.engine.evaluator;

import java.util.List;

import com.pricing.domain.CompetitorProductsPrice;

public class MinMaxPrice {
	
	public double getMinMaxPrice(AveragePriceCalculator averagePriceCalculator, double ssdLeastCompetitorPrice,
			List<CompetitorProductsPrice> finalFilteredSsdCompetitorPriceList) {
		double ssdMaxCompetitorPrice;
		if(!finalFilteredSsdCompetitorPriceList.isEmpty()) {
			MinPrice minPrice  =  new MinPrice();
			MaxPrice maxPrice  =  new MaxPrice();
			ssdLeastCompetitorPrice = minPrice.getMinPrice(finalFilteredSsdCompetitorPriceList);
			ssdMaxCompetitorPrice = maxPrice.getMaxPrice(finalFilteredSsdCompetitorPriceList);
		}
		return ssdLeastCompetitorPrice;
	}

}
