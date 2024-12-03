import java.util.List;

public class ProvincialTrain extends Regional {

    private String capabilities = "Connects small towns.";

    public ProvincialTrain(int trainNumber, String destination, List<String> stations, int travelTime) {
        super(trainNumber, destination, stations, travelTime);
    }

//METHODS

    @Override
    public void printTrain() {
        String st;

        if (getHasWifi() == true) {
            st = "yes";
        } else {
            st = "no";
        }

        System.out.println("\nTrain number: " + getTrainNumber() + "\nTrain Type: Provincial" + "\nDestination: " + getDestination() + "\nTravel time: " + getTravelTime() + "\nNumber of stops: " + getNumberOfStops() + "\nWifi: " + st + "\nCapabilities: " + capabilities);
        System.out.println("Train cars:");
        for (TrainCar car : getTrainCars()) {
            car.print();
        }
    }

}