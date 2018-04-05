package com.pricing.engine.evaluator;

import java.util.List;

import com.pricing.domain.CompetitorProductsPrice;

public class FilterProducts {

	public void getFilteredProductList(List<CompetitorProductsPrice> competitorProductsPriceList,
			List<CompetitorProductsPrice> ssdCompetitorPriceList,
			List<CompetitorProductsPrice> flashdriveCompetitorPriceList,
			List<CompetitorProductsPrice> mp3playerCompetitorPriceList) {
		
		for(CompetitorProductsPrice  competitorProductsPrice  : competitorProductsPriceList) {
			if(competitorProductsPrice.getProduct().equalsIgnoreCase("ssd") ) {
				ssdCompetitorPriceList.add(competitorProductsPrice);
			}else if(competitorProductsPrice.getProduct().equalsIgnoreCase("flashdrive") ) {
				flashdriveCompetitorPriceList.add(competitorProductsPrice);
			}else if(competitorProductsPrice.getProduct().equalsIgnoreCase("mp3player") ) {
				mp3playerCompetitorPriceList.add(competitorProductsPrice);
			}
		}
		
	}
}
