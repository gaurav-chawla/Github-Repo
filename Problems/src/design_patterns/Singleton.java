package design_patterns;

public class Singleton {

	private static Singleton singletonObject;
	
	protected Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(singletonObject == null){
			System.out.println("This is first Object Creation.");
			synchronized(Singleton.class){
				if(singletonObject == null)
					singletonObject = new Singleton();
			}
		}
		return singletonObject;
	}
}