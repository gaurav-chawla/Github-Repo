package design_patterns;

import java.io.ObjectInputStream.GetField;

public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		
		s = Singleton.getInstance();
		s = Singleton.getInstance();
		s = Singleton.getInstance();
		s = Singleton.getInstance();

	}

}
