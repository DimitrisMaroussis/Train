import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Intercity extends Train {

    private String seatClass;
    Random r = new Random();

// CONSTRUCTORS

    public Intercity(int trainNumber, String destination, List<String> stations, int travelTime) {
        super(trainNumber, destination, stations, travelTime);
        randomSeatClass();
    }

// SETTERS-GETTERS

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }
    public String getSeatClass() {
        return seatClass;
    }

// METHODS

    public void randomSeatClass() {
        List<String> seatClasses = new ArrayList<>(
                List.of("first", "second", "economy")
        );
        seatClass = seatClasses.get(r.nextInt(seatClasses.size()));
    }



}
