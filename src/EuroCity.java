import java.util.List;

public class EuroCity extends Intercity {

    private String capabilities = "Connects many countries";

    public EuroCity(int trainNumber, String destination, List<String> stations, int travelTime) {
        super(trainNumber, destination, stations, travelTime);
    }

// METHODS

    @Override
    public void printTrain() {
        System.out.println("\nTrain number: " + getTrainNumber() + "\nTrain Type: EuroCity" + "\nDestination: " + getDestination() + "\nTravel time: " + getTravelTime() + "\nSeat class: " + getSeatClass() + "\nCapabilities: " + capabilities);
        System.out.println("Train cars:");
        for (TrainCar car : getTrainCars()) {
            car.print();
        }
    }


}