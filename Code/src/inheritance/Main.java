package inheritance;

class Main {
	public static void main(String[] args) {
		/*Animal animal = new Animal("cow");
		animal.typeOfFood = "herbivore";
		animal.hasBackbone = true;
		animal.display();
		
		Bird ostrich = new Bird ("ostrich", false, "omnivore");
		ostrich.display(); */
		
		Animal bird = new Bird ("ostrich", false, "omnivore");
		bird.display();
	}
}
