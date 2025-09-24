package oopmodeling;

public class CelestialBody {
	
	//Protected: la pueden acceder sus derivados 
	
	protected double mass = 12;

	//Public: accesible por cualquiera
	
	public float size = 40;

	//Private: solo para esta clase 
	
	
	private String  name = "floating star";

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 


}
