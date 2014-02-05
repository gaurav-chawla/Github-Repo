package colleaction;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {

	private String fruitName;
	private int quantity;
	private String desc;
	
	public Fruit(String fruitName, int quantity, String desc){
		this.fruitName = fruitName;
		this.quantity = quantity;
		this.desc = desc;
	}
	
	public Fruit(){
		
	}
	
	public String getFruitName(){
		return fruitName;
	}
	
	public void setFruitName(String fruitName){
		this.fruitName = fruitName;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public void setDesc(String desc){
		this.desc = desc;
	}
	
	public int compareTo(Fruit newFruit){
		
		//Ascending Order;
		return this.quantity - newFruit.getQuantity();
		
		//return newFruit.getQuantity() - this.quantity;
	}
	
	public static Comparator<Fruit> newFruit = new Comparator<Fruit>() {

		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o1.getFruitName().toLowerCase().compareTo(o2.getFruitName().toLowerCase());
			//return 0;
		}
		
	};
	

}