package com.pricing.engine.evaluator;

import java.util.List;

import com.pricing.domain.ProductSupplyDemandInformation;

public class ActualPrice {
	

	public void getActualPrice(List<ProductSupplyDemandInformation> productSupplyDemandInformationList,
			double flashDriveLeastCompetitorPrice, double mp3playerLeastCompetitorPrice,
			double ssdLeastCompetitorPrice) {
		
		PricingSupplyDemandCalculator pricingSupplyDemandCalculator =  new PricingSupplyDemandCalculator();
		String supplyDemand = null;
		FinalPriceCalculator finalPriceCalculator = new FinalPriceCalculator();
		for(ProductSupplyDemandInformation productSupplyDemandInformation  : productSupplyDemandInformationList) {
			if(productSupplyDemandInformation.getProduct().equalsIgnoreCase("ssd") ) {
				supplyDemand =	pricingSupplyDemandCalculator.determinePriceIncrease(productSupplyDemandInformation.getSupply(), productSupplyDemandInformation.getDemand());
				finalPriceCalculator.calculateFinalPrice(productSupplyDemandInformation.getProduct(), supplyDemand, ssdLeastCompetitorPrice);
			}else if(productSupplyDemandInformation.getProduct().equalsIgnoreCase("flashdrive") ) {
				supplyDemand =	pricingSupplyDemandCalculator.determinePriceIncrease(productSupplyDemandInformation.getSupply(), productSupplyDemandInformation.getDemand());
				finalPriceCalculator.calculateFinalPrice(productSupplyDemandInformation.getProduct(), supplyDemand, flashDriveLeastCompetitorPrice);
			}else if(productSupplyDemandInformation.getProduct().equalsIgnoreCase("mp3player") ) {
				supplyDemand =	pricingSupplyDemandCalculator.determinePriceIncrease(productSupplyDemandInformation.getSupply(), productSupplyDemandInformation.getDemand());
				finalPriceCalculator.calculateFinalPrice(productSupplyDemandInformation.getProduct(), supplyDemand, mp3playerLeastCompetitorPrice);
			}
		}
		
	}



}
