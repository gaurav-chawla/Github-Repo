package design_patterns.creational.factory;

public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String country = "RUPEE";
		
		CurrencyFactory cf = new CurrencyFactory();
		try {
			ICurrency currency = cf.currencyFactory(country);
			
			String s = currency.getCurrencySymbol();
			
			System.out.println(s);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
