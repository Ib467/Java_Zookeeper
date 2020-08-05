
public class Gorilla extends Mammal {

	public void throwSomething() {
		
		this.energyLevel -=5;  		//2. decrease enegeylevel
		System.out.println("Gorilla threw something");  //print msg
		
	}
	
	public void eatBananas() {
		this.energyLevel +=10;
		System.out.println("Gorilla ate Bananas");
	}
	
	public void climb() {
		
		this.energyLevel -=10;
		System.out.println("Gorilla climed a tree...");
		
		
	}
	
}
