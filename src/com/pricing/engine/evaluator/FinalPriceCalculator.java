package com.pricing.engine.evaluator;

public class FinalPriceCalculator {
	
	private static final String FIVE_LESS = "fiveLow";
	private static final String FIVE_MORE = "fiveMore";
	private static final String TEN_MORE = "tenMore";
	private static final String SAME = "same";
	
	public void calculateFinalPrice(String product, String supplyDemand, Double leastCompetitorPrice ) {
		
		   if(supplyDemand.equalsIgnoreCase(FIVE_MORE)) {
				leastCompetitorPrice =  leastCompetitorPrice + ((leastCompetitorPrice *5)/100);
			}else if(supplyDemand.equalsIgnoreCase(TEN_MORE)) {
				leastCompetitorPrice =  leastCompetitorPrice + ((leastCompetitorPrice *10)/100);
			}else if(supplyDemand.equalsIgnoreCase(FIVE_LESS)) {
				leastCompetitorPrice =  leastCompetitorPrice - ((leastCompetitorPrice *5)/100);
			}
			System.out.println("The recommended Price for " + product +" is : " + leastCompetitorPrice);
			
		}

}
