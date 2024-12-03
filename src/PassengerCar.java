import java.util.Random;

public class PassengerCar extends TrainCar {

    private String services = "Has restaurant, toilet.";;

//Constructors

    public PassengerCar(int carNumber) {
        super(carNumber);
        fillTypeCap();
    }

    public PassengerCar(int carNumber, String carType, int capacity) {
        super(carNumber, carType, capacity);
        fillTypeCap();
    }

//Methods  

    public void fillTypeCap() {
        Random r = new Random();
        setCarType("Passenger Car");
        setCapacity(r.nextInt(20) + 15);
    }

    @Override
    public void print() {
        System.out.println("\nCar Number: " + getCarNumber() + "\nCar Type: " + getCarType() + "\nServices: " + services + "\nCapacity: " + getCapacity() + " people");
    }

} 