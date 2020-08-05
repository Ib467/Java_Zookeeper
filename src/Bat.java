
public class Bat extends Mammal {

	protected int energyLevel;
	
	public Bat() {
		this.energyLevel =300;
	}
	
	public void fly() {
		this.energyLevel -=50;
		System.out.println("flap flap flap");
	}
	
	
	public void eatHumans() {
		this.energyLevel +=25;
	}
	
	public void attackTown() {
		this.energyLevel -=100;
		System.out.println("attack!!");
	}
	
	


}
