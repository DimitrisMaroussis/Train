import java.util.ArrayList;
import java.util.Random;

public class TrainStop {

    Random r = new Random();
    private String location;
    private int ticketCost = r.nextInt(2) + 3; // θεωρείται πάντα το ίδιο κόστος από όπου και αν έφτασε κάποιο τρένο

// CONSTRUCTORS

    public TrainStop(String location) {
        this.location = location;
    }

// SETTERS-GETTERS

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }
    public int getTicketCost() {
        return this.ticketCost;
    }




}
