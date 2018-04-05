package com.pricing.engine.evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pricing.domain.ProductSupplyDemandInformation;

public class SupplyDemandDetails {

	public List<ProductSupplyDemandInformation> enterSupplyDemandDetails() {
		
		//Entering competitor products
		System.out.println("How many products supply demand information you want to enter  : " );
		Scanner numberOfSupplyDemandProducts = new Scanner(System.in); 
		int numberOfSupplyDemandProductsInfo  =  numberOfSupplyDemandProducts.nextInt();
		System.out.println("numberOfProducts  : " + numberOfSupplyDemandProductsInfo);
		return populateSupplyDemandInfo(numberOfSupplyDemandProductsInfo);
	}

	private List<ProductSupplyDemandInformation> populateSupplyDemandInfo(int numberOfSupplyDemandProductsInfo) {
		List<String> supplyDemandInfotList  =  new ArrayList<String>();
		String supplyDemandInfo = null;
		for(int i=0; i < numberOfSupplyDemandProductsInfo; i++) {
			Scanner productSupplyDemandInput = new Scanner(System.in);  
			System.out.println("Please enter the Product, Suuply and Demand Information  for the  product: ");
			 supplyDemandInfo  =  productSupplyDemandInput.nextLine();
			supplyDemandInfotList.add(supplyDemandInfo);
			System.out.println("The enetered  product supply demand info is  : " + supplyDemandInfo);
		}
		
		ProductSupplyDemandPopulator  productSupplyDemandPopulator =  new ProductSupplyDemandPopulator();
		return productSupplyDemandPopulator.populateSupplyDemandForProduct(supplyDemandInfotList);
	}
	

}
