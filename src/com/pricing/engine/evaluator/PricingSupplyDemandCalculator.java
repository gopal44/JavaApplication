package com.pricing.engine.evaluator;

public class PricingSupplyDemandCalculator {
	
private static final String FIVE_LESS = "fiveLow";
private static final String FIVE_MORE = "fiveMore";
private static final String TEN_MORE = "tenMore";
private static final String SAME = "same";
private static final String HIGH = "H";
private static final String LOW = "L";

public String determinePriceIncrease(String supply, String demand) {
	
	if(supply.equalsIgnoreCase(HIGH) && demand.equalsIgnoreCase(HIGH)) {
		return SAME;
	}else if(supply.equalsIgnoreCase(LOW) && demand.equalsIgnoreCase(LOW)) {
		return TEN_MORE;
	}else if(supply.equalsIgnoreCase(LOW) && demand.equalsIgnoreCase(HIGH)) {
		return FIVE_MORE;
	}else if(supply.equalsIgnoreCase(HIGH) && demand.equalsIgnoreCase(LOW)) {
		return FIVE_LESS;
	}
	
	return null;	
}

}
