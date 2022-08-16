package allaboutstatic;

public class StaticFieldCar {

    private String brand;
    private String engine;

    public static int numberOfCars;

    public StaticFieldCar(String brand, String engine){
        this.brand=brand;
        this.engine=engine;
        numberOfCars++;
    }

}
