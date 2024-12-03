import java.util.List;

public class SpeedTrain extends Intercity {

    private String capabilities = "Connects big cities and can reach a very high speed.";

    public SpeedTrain(int trainNumber, String destination, List<String> stations, int travelTime) {
        super(trainNumber, destination, stations, travelTime);
    }

//METHODS

    @Override
    public void printTrain() {
        System.out.println("\nTrain number: " + getTrainNumber()+ "\nTrain Type: Speed Train" + "\nDestination: " + getDestination() + "\nTravel time: " + getTravelTime() + "\nSeat class: " + getSeatClass() + "\nCapabilities: " + capabilities);
        System.out.println("Train cars:");
        for (TrainCar car : getTrainCars()) {
            car.print();
        }
    }

}