import java.util.Random;

public class SupplyCar extends TrainCar {

    private String services = "Carries lots of food.";

//Constructors

    public SupplyCar(int carNumber) {
        super(carNumber);
        fillTypeCap();
    }

    public SupplyCar(int carNumber, String carType, int capacity) {
        super(carNumber, carType, capacity);
        fillTypeCap();
    }

//Methods  

    public void fillTypeCap() {
        Random r = new Random();
        setCarType("Supply Car");
        setCapacity(r.nextInt(1000) + 1000);
    }

    @Override
    public void print() {
        System.out.println("\nCar Number: " + getCarNumber() + "\nCar Type: " + getCarType() + "\nServices: " + services + "\nCapacity: " + getCapacity() + " kg of food");
    }



}