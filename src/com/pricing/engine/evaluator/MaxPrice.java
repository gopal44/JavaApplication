package com.pricing.engine.evaluator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.pricing.domain.CompetitorProductsPrice;

public class MaxPrice {
	
	public double getMaxPrice(List<CompetitorProductsPrice> competitorPriceList) {
		double ssdLeastCompetitorPrice = 0.0;
		List<Double> leastPriceList  =  new ArrayList<Double>();
		
		for(CompetitorProductsPrice  ssdCompetitorProductsPrice : competitorPriceList) {
			 leastPriceList.add(Double.parseDouble(ssdCompetitorProductsPrice.getPrice()));
		}
		
		 ssdLeastCompetitorPrice  =  Collections.max(leastPriceList);
		 System.out.println("ssdMaxCompetitorPrice  : " + ssdLeastCompetitorPrice);
		return Collections.min(leastPriceList);
	}
	

}
