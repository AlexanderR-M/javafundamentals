package oopmodeling;

public class CelestialBody {
	
	//Protected: la pueden acceder sus derivados 
	
	protected double mass = 12;

	//Public: accesible por cualquiera
	
	public float size = 40;



	//Private: solo para esta clase 
	
	
	protected String  name = "floating star";

    public float radius = 1234567.3f;

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

    public void setRadius(float radius) {this.radius = radius;}

    //constructor of this class

    public CelestialBody(){

    }

    public CelestialBody(String name){
        this.name = name;
    }

    public CelestialBody(double mass, String name){
        this.name = name;
        this.mass = mass;
    }


}
