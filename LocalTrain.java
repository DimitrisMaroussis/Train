import java.util.List;

public class LocalTrain extends Regional {

    private String capabilities = "Connects local areas.";

    public LocalTrain(int trainNumber, String destination, List<String> stations, int travelTime) {
        super(trainNumber, destination, stations, travelTime);
    }

    @Override
    public void printTrain() {
        String st;

        if (getHasWifi() == true) {
            st = "yes";
        } else {
            st = "no";
        }

        System.out.println("\nTrain number: " + getTrainNumber() + "\nTrain Type: Local" + "\nDestination: " + getDestination() + "\nTravel time: " + getTravelTime() + "\nNumber of stops: " + getNumberOfStops() + "\nWifi: " + st + "\nCapabilities: " + capabilities);
        System.out.println("Train cars:");
        for (TrainCar car : getTrainCars()) {
            car.print();
        }
    }

}