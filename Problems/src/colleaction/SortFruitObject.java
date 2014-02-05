package colleaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortFruitObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Fruit> fruitList = new ArrayList<Fruit>();
		
		Fruit f1 = new Fruit();
		f1.setFruitName("Banana");
		f1.setQuantity(12);
		
		
		fruitList.add(f1);
		
		Fruit f2 = new Fruit();
		f2.setFruitName("Mango");
		f2.setQuantity(23);
		
		
		fruitList.add(f2);
		
		Fruit f3 = new Fruit();
		f3.setFruitName("Kiwi");
		f3.setQuantity(11);
		
		
		fruitList.add(f3);
		
		Collections.sort(fruitList, Fruit.newFruit);
		
		for(Fruit f : fruitList){
			System.out.println(f.getFruitName()+" "+f.getQuantity());
		}
		
		Iterator i = fruitList.iterator();
		
		while(i.hasNext()){
			Fruit f = (Fruit) i.next();
			System.out.println(f.getFruitName()+" "+f.getQuantity());
		}
	}

}