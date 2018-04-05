package com.pricing.engine.evaluator;

import java.util.List;

import com.pricing.domain.CompetitorProductsPrice;
import com.pricing.domain.ProductSupplyDemandInformation;

public class PricingEngine {
	
	public static void main(String[] args) {
		
		SupplyDemandDetails supplyDemandDetails =  new SupplyDemandDetails();
		CompetitorDetails competitorDetails =  new CompetitorDetails();
		List<ProductSupplyDemandInformation> productSupplyDemandInformationList = supplyDemandDetails.enterSupplyDemandDetails();
		List<CompetitorProductsPrice> competitorProductsPriceList =  competitorDetails.enterCompetitorDetails();
		ProductSeggregator productSeggregator = new ProductSeggregator(); 
		productSeggregator.seggregateProductsList(productSupplyDemandInformationList, competitorProductsPriceList);
	}
}
