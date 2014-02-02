package design_patterns.creational.factory;

public class CurrencyFactory {
	
	public static ICurrency currencyFactory(String country) throws IllegalAccessException{
		if(country.equals("USA")){
			return new USDImpl();
		}else if(country.equals("EURO")){
			return new EuroImpl();
		}else if(country.equals("RUPEE")){
			return new RupeeImpl();
		}
		throw new IllegalArgumentException("No Such Country");
	}
}