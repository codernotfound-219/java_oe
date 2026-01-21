package inheritance;

public class Bird extends Animal {
	protected boolean hasFeathers;
	protected boolean canFly;
	
	public Bird (String name, boolean canFly, String typeOfFood) {
		super(name);
		this.canFly = canFly;
		this.typeOfFood = typeOfFood;
	
		// features of birds
		this.hasBackbone = true;
		this.hasFeathers = true;
	} 
		
	public void display() {
		System.out.println("Animal::Bird::name="+this.getName()+ ", typeOfFood="+ typeOfFood+", hasBackbone="+ hasBackbone+ ", canFly="+canFly  +", hasFeathers=" + hasFeathers);
	}
}
