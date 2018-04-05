package com.pricing.engine.evaluator;

import java.util.ArrayList;
import java.util.List;

import com.pricing.domain.ProductSupplyDemandInformation;

public class ProductSupplyDemandPopulator {
	
	public List<ProductSupplyDemandInformation> populateSupplyDemandForProduct(List<String> supplyDemandInfotList) {
		List<ProductSupplyDemandInformation> productSupplyDemandInformationList =  new ArrayList<ProductSupplyDemandInformation>();
		
	 for(String supplyDemand : supplyDemandInfotList ) {
	    String[] productSupplyDemandArray = supplyDemand.split(" ");
	    int productIndex = 1;
	    ProductSupplyDemandInformation productSupplyDemandInformation = new ProductSupplyDemandInformation();
	      for (String productInfo : productSupplyDemandArray) {
	        
	    	  
	    	  if(productIndex == 1) {
	 			 productSupplyDemandInformation.setProduct(productInfo);
	 		 }else if(productIndex == 2) {
	 			 productSupplyDemandInformation.setSupply(productInfo);
	 		 }else if(productIndex == 3) {
	 			 productSupplyDemandInformation.setDemand(productInfo);
	 		 }
	 		 productIndex++;
	         //populateProductSupplyDemand(productIndex, productSupplyDemandInformation, productInfo);
	        
	      }
	      productSupplyDemandInformationList.add(productSupplyDemandInformation);
	}
	 
	 
	 
	 
	 // We can remove the below lines after testing
	      System.out.println(" productSupplyDemandInformationList size  : " + productSupplyDemandInformationList.size());
	      for(ProductSupplyDemandInformation productSupplyDemandInformation1 : productSupplyDemandInformationList) {
	    	  
	    	 System.out.println( "Product  : " + productSupplyDemandInformation1.getProduct());
	    	 System.out.println("Supply  : " + productSupplyDemandInformation1.getSupply());
	    	 System.out.println("Demand  : " + productSupplyDemandInformation1.getDemand());
	    	 
	    	 
	    	// PricingSupplyDemandCalculator pricingSupplyDemandCalculator =  new PricingSupplyDemandCalculator();
	    	// pricingSupplyDemandCalculator.determinePriceIncrease(productSupplyDemandInformation1.getSupply(),  productSupplyDemandInformation1.getDemand());
	    	  
	    	  
	      }
	      
	      return productSupplyDemandInformationList;
	}

}
