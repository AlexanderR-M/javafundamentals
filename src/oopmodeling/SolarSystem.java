package oopmodeling;

public class SolarSystem {
    public static void main(String[] args) {
        Object obj = new Planet();
        Planet obj2 = new Planet();
        Planet jupiter = new Planet(322332,"Jupiter");
        Planet jupiter2 = new Planet(456632,"Jupiter2");
        Planet mars = new Planet( 322332, "Mars", 2367);
        System.out.println(jupiter.getName());

        CelestialBody body3 = new Planet();

        System.out.println(obj);
        System.out.println(obj2);
    }

}
