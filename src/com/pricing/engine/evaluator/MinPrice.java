package com.pricing.engine.evaluator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.pricing.domain.CompetitorProductsPrice;

public class MinPrice {

	public double getMinPrice(List<CompetitorProductsPrice> competitorPriceList) {
		double leastCompetitorPrice = 0.0;
		List<Double> leastPriceList  =  new ArrayList<Double>();
		
		for(CompetitorProductsPrice  ssdCompetitorProductsPrice : competitorPriceList) {
			 leastPriceList.add(Double.parseDouble(ssdCompetitorProductsPrice.getPrice()));
		}
		 
		 boolean isDuplicateValue = false;
			Set<Double> uniqueSet = new HashSet<Double>(leastPriceList);
			Set<Double> repeatedValuesSet =  new HashSet<Double>();
			for (Double value : uniqueSet) {
				System.out.println(value + ": " + Collections.frequency(leastPriceList, value));
				
				if(Collections.frequency(leastPriceList, value) > 1) {
					repeatedValuesSet.add(value);
					isDuplicateValue = true;
				}
			}
			
			if(isDuplicateValue) {
				 leastCompetitorPrice  =  Collections.min(repeatedValuesSet);
			}else {
				 leastCompetitorPrice  =  Collections.min(leastPriceList);
			}
			
			
		 System.out.println("ssdLeastCompetitorPrice  : " + leastCompetitorPrice);
		return leastCompetitorPrice;
	}

}
