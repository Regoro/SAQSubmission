package com.thehit.factories;

import com.thehit.domain.Euro;
import com.thehit.domain.Pounds;
import com.thehit.interfaces.Currency;

public class CurrencyFactory {
	
	public static Currency createCurrency (String country) {
	       if (country.equalsIgnoreCase ("Ireland")){
	              return new Euro();
	       }else if(country.equalsIgnoreCase ("England")){
	              return new Pounds();
	       }
	       else return null;
	  }	
}
