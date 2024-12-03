import java.util.Random;

public class ServiceCar extends TrainCar {

    private String services = "Has cleaning room and changing room.";

//Constructors

    public ServiceCar(int carNumber) {
        super(carNumber);
        fillTypeCap();
    }

    public ServiceCar(int carNumber, String carType, int capacity) {
        super(carNumber, carType, capacity);
        fillTypeCap();
    }

//Methods  

    public void fillTypeCap() {
        Random r = new Random();
        setCarType("Service Car");
        setCapacity(r.nextInt(4) + 6);
    }

    @Override
    public void print() {
        System.out.println("\nCar Number: " + getCarNumber() + "\nCar Type: " + getCarType() + "\nServices: " + services + "\nCapacity: " + getCapacity() + " people");
    }

}