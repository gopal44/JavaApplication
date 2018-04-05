package com.pricing.engine.evaluator;

import java.util.ArrayList;
import java.util.List;

import com.pricing.domain.CompetitorProductsPrice;

public class FilterCompetitorPrice {
	


public List<CompetitorProductsPrice> getFilterCompetitorPrice(List<CompetitorProductsPrice> ssdCompetitorPriceList,
		double ssdFiftyPercentAveragePrice) {
	
	List<CompetitorProductsPrice> filteredCompetitorPriceList  = new ArrayList<CompetitorProductsPrice>();
	List<CompetitorProductsPrice> finalFilteredCompetitorPriceList  = new ArrayList<CompetitorProductsPrice>();
	
	for(CompetitorProductsPrice  competitorProductsPrice  : ssdCompetitorPriceList) {
		if(!(Double.parseDouble(competitorProductsPrice.getPrice()) < ssdFiftyPercentAveragePrice)) {
			filteredCompetitorPriceList.add(competitorProductsPrice);
		}
	}
	
	for(CompetitorProductsPrice  competitorProductsPrice  : filteredCompetitorPriceList) {
		if(!(Double.parseDouble(competitorProductsPrice.getPrice()) > ((Double.parseDouble(competitorProductsPrice.getPrice())  + ssdFiftyPercentAveragePrice)))) {
			finalFilteredCompetitorPriceList.add(competitorProductsPrice);
		}
	}
	
	return finalFilteredCompetitorPriceList;
}

}
