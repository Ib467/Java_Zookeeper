
public class Mammal {
	
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel =100;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//getting energy 
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	//setting energy 
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void throwSomething() {
		System.out.println(energyLevel);
		
	}
	
}