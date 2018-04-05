package com.pricing.engine.evaluator;

import java.util.List;

import com.pricing.domain.CompetitorProductsPrice;

public class AveragePriceCalculator {
		
		public double getAveragePrice(List<CompetitorProductsPrice> competitorPriceList) {
			double sum = 0.0;
			for(CompetitorProductsPrice  ssdCompetitorProductsPrice : competitorPriceList) {
				 sum += Float.parseFloat(ssdCompetitorProductsPrice.getPrice());
				
			}
			return sum / competitorPriceList.size();
		}
		
}
