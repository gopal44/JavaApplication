package com.pricing.engine.evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pricing.domain.CompetitorProductsPrice;
import com.pricing.domain.ProductSupplyDemandInformation;

public class CompetitorDetails {
	


	public List<CompetitorProductsPrice> enterCompetitorDetails() {
		//Entering competitor products
		System.out.println("How many competitor products information you want to enter  : " );
		Scanner numberOfProducts = new Scanner(System.in); 
		int numberOfProductsInfo  =  numberOfProducts.nextInt();
		System.out.println("numberOfProducts  : " + numberOfProductsInfo);
		
		List<String> productList  =  new ArrayList<String>();
		for(int i=0; i < numberOfProductsInfo; i++) {
			Scanner reader = new Scanner(System.in);  
			System.out.println("Enter the product information : ");
			String product  =  reader.nextLine();
			//reader.close();
			productList.add(product);
		
		}
		
		CompetitorProductPricePopulator  competitorProductPricePopulator =  new CompetitorProductPricePopulator();
		return competitorProductPricePopulator.populateCompetitorPriceForProduct(productList);
		//return productList;
	}

}
