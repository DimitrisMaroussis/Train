import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Regional extends Train {

// Πρόσθετες ιδιότητες (properties)

    private int numberOfStops;
    private boolean hasWifi;
    Random r = new Random();

// Κατασκευαστής (constructor)

    public Regional(int trainNumber, String destination, List<String> stations, int travelTime) {
        super(trainNumber, destination, stations, travelTime);
        setChars();
    }

// setters-getters

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }
    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    public boolean getHasWifi() {
        return hasWifi;
    }

// METHODS

    public void setChars() {
        int x = r.nextInt(2);
        if (x == 1) {
            hasWifi = true;
        } else {
            hasWifi = false;
        }

        List<String> stations1 = new ArrayList<>();

        stations1.add("New York, NY");
        stations1.add("Washington, DC");
        stations1.add("Boston, MA");
        stations1.add("Philadelphia, PA");
        stations1.add("Chicago, IL");
        stations1.add("Los Angeles, CA");
        stations1.add("San Francisco, CA");
        stations1.add("Atlanta, GA");
        stations1.add("Miami, FL");
        stations1.add("Seattle, WA");
        stations1.add("Portland, OR");
        stations1.add("Denver, CO");
        stations1.add("Houston, TX");
        stations1.add("Dallas, TX");
        stations1.add("St. Louis, MO");
        stations1.add("New Orleans, LA");
        stations1.add("Baltimore, MD");
        stations1.add("Charlotte, NC");
        stations1.add("Nashville, TN");
        stations1.add("Memphis, TN");
        stations1.add("Austin, TX");
        stations1.add("San Diego, CA");
        stations1.add("Sacramento, CA");
        stations1.add("Las Vegas, NV");
        stations1.add("Salt Lake City, UT");
        stations1.add("Kansas City, MO");
        stations1.add("Omaha, NE");
        stations1.add("Minneapolis, MN");
        stations1.add("Milwaukee, WI");
        stations1.add("Detroit, MI");
        stations1.add("Cleveland, OH");
        stations1.add("Cincinnati, OH");
        stations1.add("Pittsburgh, PA");
        stations1.add("Buffalo, NY");
        stations1.add("Toronto, ON (Canada)");
        stations1.add("Montreal, QC (Canada)");
        stations1.add("Vancouver, BC (Canada)");
        stations1.add("Winnipeg, MB (Canada)");
        stations1.add("Edmonton, AB (Canada)");
        stations1.add("Saskatoon, SK (Canada)");
        stations1.add("Calgary, AB (Canada)");
        stations1.add("Regina, SK (Canada)");
        stations1.add("Anchorage, AK");
        stations1.add("Portland, ME");
        stations1.add("Burlington, VT");
        stations1.add("Providence, RI");
        stations1.add("Hartford, CT");
        stations1.add("Richmond, VA");
        stations1.add("Raleigh, NC");
        stations1.add("Tampa, FL");

        int count = 0;

        for (int i = 0; i < getStations().size(); i++) {
            for (int j = 0; j < stations1.size(); j++) {
                if (getStations().get(i).equals(stations1.get(j))) {
                    count++;
                }
            }
        }

        numberOfStops = count;
    }

}
