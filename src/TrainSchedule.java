import java.util.ArrayList;
import java.util.List;

public class TrainSchedule {

// Ιδιότητες (properties)

    private List<Train> trains;
    private List<TrainStop> routes;

// Κατασκευαστής (constructor)

    public TrainSchedule() {
        trains = new ArrayList<Train>();
        routes = new ArrayList<TrainStop>();
    }

// Μέθοδοι (methods)

    public void addStopToRoutes(TrainStop ts) {
        routes.add(ts);
    }

    public List<TrainStop> getRoutes() {
        return routes;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public void removeTrain(Train train) {
        for (Train t : trains) {
            if (t.getTrainNumber() == train.getTrainNumber()) {
                trains.remove(t);
                break;
            }
        }
    }

    public Train findNextTrain(String station) {
        Train nextTrain = null;
        int minMinutes = Integer.MAX_VALUE;

        for (Train train : trains) {
            List<String> stations = train.getStations();
            if (stations.contains(station)) {
                int minutes = train.getDepartureTimeInMins() + stations.indexOf(station) * train.getTravelTime();
                if (minutes < minMinutes) {
                    minMinutes = minutes;
                    nextTrain = train;
                }
            }
        }

        return nextTrain;
    }

}