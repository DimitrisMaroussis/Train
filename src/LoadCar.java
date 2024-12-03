import java.util.Random;

public class LoadCar extends TrainCar {

    private String services = "Carries containers or cars.";

//Constructors

    public LoadCar(int carNumber) {
        super(carNumber);
        fillTypeCap();
    }

    public LoadCar(int carNumber, String carType, int capacity) {
        super(carNumber, carType, capacity);
        fillTypeCap();
    }

//Methods

    public void fillTypeCap() {
        Random r = new Random();
        setCarType("Load Car");
        setCapacity(r.nextInt(2) + 1);
    }

    @Override
    public void print() {
        System.out.println("\nCar Number: " + getCarNumber() + "\nCar Type: " + getCarType() + "\nServices: " + services + "\nCapacity: " + getCapacity() + " cars or containers");
    }

}