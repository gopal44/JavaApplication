package com.pricing.engine.evaluator;

import java.util.ArrayList;
import java.util.List;

import com.pricing.domain.CompetitorProductsPrice;

public class CompetitorProductPricePopulator {

	public List<CompetitorProductsPrice> populateCompetitorPriceForProduct(List<String> productList) {
		
		List<CompetitorProductsPrice> competitorDemandPriceList =  new ArrayList<CompetitorProductsPrice>();
		
		 for(String productCompetitorPrice : productList ) {
		    String[] productSupplyDemandArray = productCompetitorPrice.split(" ");
		    int productIndex = 1;
		    CompetitorProductsPrice competitorProductsPrice = new CompetitorProductsPrice();
		      for (String productInfo : productSupplyDemandArray) {
		    	  
		    	  if(productIndex == 1) {
		 			 competitorProductsPrice.setProduct(productInfo);
		 		 }else if(productIndex == 2) {
		 			 competitorProductsPrice.setCompetitorName(productInfo);
		 		 }else if(productIndex == 3) {
		 			 competitorProductsPrice.setPrice(productInfo);
		 		 }
		 		 productIndex++;
		         //populateProductSupplyDemand(productIndex, productSupplyDemandInformation, productInfo);
		        
		      }
		      competitorDemandPriceList.add(competitorProductsPrice);
		}
		 
		 
		 
		 
		 // We can remove the below lines after testing
		      System.out.println(" productSupplyDemandInformationList size  : " + competitorDemandPriceList.size());
		      for(CompetitorProductsPrice productSupplyDemandInformation1 : competitorDemandPriceList) {
		    	  
		    	 System.out.println( "Product  : " + productSupplyDemandInformation1.getProduct());
		    	 System.out.println("Competitor  : " + productSupplyDemandInformation1.getCompetitorName());
		    	 System.out.println("Price  : " + productSupplyDemandInformation1.getPrice());
		    	 
		    	 
		    	// PricingSupplyDemandCalculator pricingSupplyDemandCalculator =  new PricingSupplyDemandCalculator();
		    	// pricingSupplyDemandCalculator.determinePriceIncrease(productSupplyDemandInformation1.getSupply(),  productSupplyDemandInformation1.getDemand());
		    	  
		    	  
		      }
		      
		      return competitorDemandPriceList;
	}

}
