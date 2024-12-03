import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Train {

// Ιδιότητες (properties)

    Random r = new Random();
    private int trainNumber;
    private String destination;
    List<String> stations;
    private String departureTime;
    private String arrivalTime;
    List<TrainStop> trainStops = new ArrayList<>();
    private int travelTime;
    private List<TrainCar> trainCars = new ArrayList<>();

// Κατασκευαστής (constructor)

    public Train(int trainNumber, String destination, List<String> stations, int travelTime) {
        this.trainNumber = trainNumber;
        this.destination = destination;
        this.stations = stations;
        this.travelTime = travelTime;
        setTrainStops();
        setDepartureArrivalTime();
    }

// setters-getters

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    public int getTrainNumber() {
        return this.trainNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDestination() {
        return this.destination;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
    public int getTravelTime() {
        return travelTime;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public String getArrivalTime() {
        return this.arrivalTime;
    }


// Μέθοδοι (methods)

    public void setTrainStops() {
        for (int i = 0; i < stations.size(); i++) {
            trainStops.add(new TrainStop(stations.get(i)));
        }
    }

    public void updateTrainStops(TrainSchedule trainS) {
        for (int i = 0; i < trainStops.size(); i++) {
            for (int j = 0; j < trainS.getRoutes().size(); j++) {
                if (trainS.getRoutes().get(j).getLocation().equals(trainStops.get(i).getLocation())) {
                    trainStops.set(trainStops.indexOf(trainStops.get(i)), trainS.getRoutes().get(j));
                }
            }
        }
    }

    public void setDepartureArrivalTime() {
        int x = r.nextInt(24);
        int y = r.nextInt(60);

        String bTime, sTime;

        if (x < 10) {
            bTime = "0" + String.valueOf(x);
        } else {
            bTime = String.valueOf(x);
        }

        if (y < 10) {
            sTime = "0" + String.valueOf(y);
        } else {
            sTime = String.valueOf(y);
        }

        departureTime = bTime + ":" + sTime;

        int travelT =  (trainStops.size() - 1) * travelTime;
        y += travelT;

        if (y >= 60) {
            int bigTime = (y - y % 60) / 60 + x;
            int smallTime = y % 60;

            if (bigTime < 10) {
                bTime = "0" + String.valueOf(bigTime);
            } else {
                bTime = String.valueOf(bigTime);
            }

            if (smallTime < 10) {
                sTime = "0" + String.valueOf(smallTime);
            } else {
                sTime = String.valueOf(smallTime);
            }

            arrivalTime = bTime + ":" + sTime;

            if (bigTime >= 24) {
                arrivalTime = "0" + String.valueOf(bigTime - 24) + ":" + String.valueOf(smallTime);
            }
        } else {
            if (y < 10) {
                sTime = "0" + String.valueOf(y);
            } else {
                sTime = String.valueOf(y);
            }

            arrivalTime = bTime + ":" + sTime;
        }


    }

    public int getDepartureTimeInMins() {
        int x = Integer.parseInt(departureTime.substring(0, 2)) * 60 + Integer.parseInt(departureTime.substring(3, 5));

        return x;
    }

    public int getTicketCostForRoute() {
        int x = 0;

        for (int i = 0; i < trainStops.size(); i++) {
            x += trainStops.get(i).getTicketCost();
        }

        return x;
    }

    public void setTrainCars(List<TrainCar> trainCars) {
        this.trainCars = trainCars;
    }

    public List<TrainCar> getTrainCars() {
        return this.trainCars;
    }

    public void addTrainCar(TrainCar trainCar) {
        this.trainCars.add(trainCar);
    }

    public void removeTrainCar(TrainCar trainCar) {
        this.trainCars.remove(trainCar);
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public List<String> getStations() {
        return this.stations;
    }

    public void printTrain() {
    }


}
