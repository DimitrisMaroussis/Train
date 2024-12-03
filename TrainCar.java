public class TrainCar {

// Ιδιότητες (properties)

    private int carNumber;
    private String carType;
    private int capacity;

// Κατασκευαστής (constructor)

    public TrainCar() {}

    public TrainCar(int carNumber) {
        this.carNumber = carNumber;
    }

    public TrainCar(int carNumber, String carType, int capacity) {
        this.carNumber = carNumber;
        this.carType = carType;
        this.capacity = capacity;
    }

// setters-getters

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
    public int getCarNumber() {
        return carNumber;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    public String getCarType() {
        return carType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

// methods

    public void print() {
    }


}