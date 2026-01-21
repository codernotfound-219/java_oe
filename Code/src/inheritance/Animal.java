package inheritance;

public class Animal {
	protected boolean hasBackbone;
	protected String typeOfFood;
	private String name;
	
	public Animal (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println("Animal::name="+name+ ", typeOfFood="+ typeOfFood+", hasBackbone="+ hasBackbone);
	}	
}



















/*
import java.util.Random;
	private String code;
	private void createCode() {
		Random rand = new Random();
		this.code = name + rand.nextInt(100);
	}
	
	public String getCode() {
		return this.code;
	}
	
*/

