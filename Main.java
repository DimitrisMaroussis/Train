import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;

class Main {


    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static TrainCar getRandomTrainCar(int carN) {
        Random r = new Random();
        int x = r.nextInt(4);
        TrainCar temp = new TrainCar();

        switch (x) {
            case 0:
                return new PassengerCar(carN);
            case 1:
                return new LoadCar(carN);
            case 2:
                return new ServiceCar(carN);
            case 3:
                return new SupplyCar(carN);
        }
        return temp;
    }

    public static List<String> trainStations(int x, List<String> stations) {
        Random r = new Random();
        List<String> stations2 = new ArrayList<>(stations);

        List<String> trainStops1 = new ArrayList<String>();
        trainStops1.add("Grand Central");
        trainStops1.add("Times Square");
        trainStops1.add("Penn Station");
        trainStops1.add("Herald Square");
        trainStops1.add("Union Square");
        trainStops1.add("14th Street");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops1.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops2 = new ArrayList<String>();
        trainStops2.add("Central Park");
        trainStops2.add("Gare de Lyon");
        trainStops2.add("Empire State Building");
        trainStops2.add("Madison Square Garden");
        trainStops2.add("Chelsea Market");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops1.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops3 = new ArrayList<String>();
        trainStops3.add("King's Cross");
        trainStops3.add("Tokyo");
        trainStops3.add("Liverpool Street");
        trainStops3.add("Victoria");
        trainStops3.add("Waterloo");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops3.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops4 = new ArrayList<String>();
        trainStops4.add("Shinjuku");
        trainStops4.add("Tokyo");
        trainStops4.add("Shibuya");
        trainStops4.add("Ueno");
        trainStops4.add("High Line");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops4.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops5 = new ArrayList<String>();
        trainStops5.add("Munich");
        trainStops5.add("Frankfurt");
        trainStops5.add("Redfern Station");
        trainStops5.add("Berlin");
        trainStops5.add("Cologne");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops5.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops6 = new ArrayList<String>();
        trainStops6.add("Hakata");
        trainStops6.add("Tokyo");
        trainStops6.add("Shin-Osaka");
        trainStops6.add("Nagoya");
        trainStops6.add("Hiroshima");
        trainStops6.add("Ueno");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops6.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops7 = new ArrayList<String>();
        trainStops7.add("Gare du Nord");
        trainStops7.add("Gare de Lyon");
        trainStops7.add("Gare Saint-Lazare");
        trainStops7.add("Sol");
        trainStops7.add("Gare Montparnasse");
        trainStops7.add("Grand Central");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops7.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops8 = new ArrayList<String>();
        trainStops8.add("Redfern Station");
        trainStops8.add("Mumbai Central");
        trainStops8.add("Ueno");
        trainStops8.add("Borivali");
        trainStops8.add("Thane");
        trainStops8.add("Dadar");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops8.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops9 = new ArrayList<String>();
        trainStops9.add("Atocha");
        trainStops9.add("Chamartín");
        trainStops9.add("Príncipe Pío");
        trainStops9.add("Nuevos Ministerios");
        trainStops9.add("Sol");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops9.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        stations2 = new ArrayList<>(stations);
        List<String> trainStops10 = new ArrayList<String>();
        trainStops10.add("Central Station");
        trainStops10.add("Town Hall Station");
        trainStops10.add("Gare de Lyon");
        trainStops10.add("Wynyard Station");
        trainStops10.add("North Sydney Station");
        for (int i = 0; i < r.nextInt(6) + 5; i++) {
            int y = r.nextInt(stations2.size());
            trainStops10.add(stations2.get(y));
            stations2.remove(stations2.get(y));
        }

        switch (x) {
            case 0:
                return trainStops1;
            case 1:
                return trainStops2;
            case 2:
                return trainStops3;
            case 3:
                return trainStops4;
            case 4:
                return trainStops5;
            case 5:
                return trainStops6;
            case 6:
                return trainStops7;
            case 7:
                return trainStops8;
            case 8:
                return trainStops9;
            case 9:
                return trainStops10;
        }
        return trainStops10;
    }

    public static void main(String[] args) {
        clean();

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        TrainSchedule trainS = new TrainSchedule();

        String cont;

        int trainN = 1;
        int carN = 1;

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

//inter1 --------------
        List<String> subSt1 = trainStations(0, stations1);
        EuroCity inter1 = new EuroCity(trainN++, subSt1.get(subSt1.size() - 1), subSt1, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            inter1.addTrainCar(getRandomTrainCar(carN++));
        }
        inter1.printTrain();
        carN = 1;

        cont = sc.nextLine();

//inter2 --------------
        List<String> subSt2 = trainStations(1, stations1);
        SpeedTrain inter2 = new SpeedTrain(trainN++, subSt2.get(subSt2.size() - 1), subSt2, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            inter2.addTrainCar(getRandomTrainCar(carN++));
        }
        inter2.printTrain();
        carN = 1;

        cont = sc.nextLine();

//inter3 ------------
        List<String> subSt3 = trainStations(2, stations1);
        SpeedTrain inter3 = new SpeedTrain(trainN++, subSt3.get(subSt3.size() - 1), subSt3, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            inter3.addTrainCar(getRandomTrainCar(carN++));
        }
        inter3.printTrain();
        carN = 1;

        cont = sc.nextLine();

//inter4 ------------
        List<String> subSt4 = trainStations(3, stations1);
        EuroCity inter4 = new EuroCity(trainN++, subSt4.get(subSt4.size() - 1), subSt4, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            inter4.addTrainCar(getRandomTrainCar(carN++));
        }
        inter4.printTrain();
        carN = 1;

        cont = sc.nextLine();

//inter5 ---------------
        List<String> subSt5 = trainStations(4, stations1);
        EuroCity inter5 = new EuroCity(trainN++, subSt5.get(subSt5.size() - 1), subSt5, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            inter5.addTrainCar(getRandomTrainCar(carN++));
        }
        inter5.printTrain();
        carN = 1;

        cont = sc.nextLine();

//reg1 --------------
        List<String> subSt6 = trainStations(5, stations1);
        LocalTrain reg1 = new LocalTrain(trainN++, subSt6.get(subSt6.size() - 1), subSt6, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            reg1.addTrainCar(getRandomTrainCar(carN++));
        }
        reg1.printTrain();
        carN = 1;

        cont = sc.nextLine();

//reg2 ----------------
        List<String> subSt7 = trainStations(6, stations1);
        LocalTrain reg2 = new LocalTrain(trainN++, subSt7.get(subSt7.size() - 1), subSt7, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            reg2.addTrainCar(getRandomTrainCar(carN++));
        }
        reg2.printTrain();
        carN = 1;

        cont = sc.nextLine();

//reg3 ----------------
        List<String> subSt8 = trainStations(7, stations1);
        ProvincialTrain reg3 = new ProvincialTrain(trainN++, subSt8.get(subSt8.size() - 1), subSt8, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            reg3.addTrainCar(getRandomTrainCar(carN++));
        }
        reg3.printTrain();
        carN = 1;

        cont = sc.nextLine();

//reg4 ----------------
        List<String> subSt9 = trainStations(8, stations1);
        ProvincialTrain reg4 = new ProvincialTrain(trainN++, subSt9.get(subSt9.size() - 1), subSt9, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            reg4.addTrainCar(getRandomTrainCar(carN++));
        }
        reg4.printTrain();
        carN = 1;

        cont = sc.nextLine();

//reg5 ------------
        List<String> subSt10 = trainStations(9, stations1);
        ProvincialTrain reg5 = new ProvincialTrain(trainN++, subSt10.get(subSt10.size() - 1), subSt10, r.nextInt(2) + 3);
        for (int i = 0; i < r.nextInt(21) + 10; i++) {
            reg5.addTrainCar(getRandomTrainCar(carN++));
        }
        reg5.printTrain();
        carN = 1;

        cont = sc.nextLine();

// add to train schedule ---------------------------------------

        trainS.addTrain(inter1);
        trainS.addTrain(inter2);
        trainS.addTrain(inter3);
        trainS.addTrain(inter4);
        trainS.addTrain(inter5);
        trainS.addTrain(reg1);
        trainS.addTrain(reg2);
        trainS.addTrain(reg3);
        trainS.addTrain(reg4);
        trainS.addTrain(reg5);



// make 100 random TrainStops --------------------------------------------


        for (int i = 0; i < stations1.size(); i++) {
            trainS.addStopToRoutes(new TrainStop(stations1.get(i)));
        }
    // update TrainStops
        for(Train train : trainS.getTrains()) {
            train.updateTrainStops(trainS);
        }

// train to the first TrainStop ----------------------------------------

        Train nextTrain = trainS.findNextTrain(trainS.getRoutes().get(0).getLocation());

        System.out.println("\nBased on departure time and the travel time of every station it goes though and the number of stations it has to pass until it gets to " + trainS.getRoutes().get(0).getLocation() + ", the next train to reach the first stop is:");
        if (nextTrain == null) {
            System.out.println("\nNo train found.");
        } else {
            nextTrain.printTrain();
        }

        cont = sc.nextLine();

// delete train -----------------------------------------------------

        if (trainS.getTrains().indexOf(nextTrain) != 0) {
            trainS.removeTrain(trainS.getTrains().get(trainS.getTrains().indexOf(nextTrain) - 1));
            for (int i = 0; i < trainS.getTrains().size(); i++) {
                trainS.getTrains().get(i).setTrainNumber(i + 1);
            }
        } else {
            trainS.removeTrain(trainS.getTrains().get(trainS.getTrains().size() - 1));
            for (int i = 0; i < trainS.getTrains().size(); i++) {
                trainS.getTrains().get(i).setTrainNumber(i + 1);
            }
        }


// train to last TrainStop ----------------------------------------------------

        String location = trainS.getRoutes().get(trainS.getRoutes().size() - 1).getLocation();
        Train nextTrain2 = trainS.findNextTrain(location);

        System.out.println("\nBased on departure time and the travel time of every station it goes though and the number of stations it has to pass until it gets to " + trainS.getRoutes().get(trainS.getRoutes().size() - 1).getLocation() + ", the next train to reach the last stop is:");
        System.out.println("\nThe cost of the whole route is: " + nextTrain2.getTicketCostForRoute() );
        if (nextTrain2 == null) {
            System.out.println("\nNo train found at " + location + " location.");
        } else {
            nextTrain2.printTrain();
        }


        cont = sc.nextLine();

// reg print -----------------------------------------------

        List<Regional> reg = new ArrayList<>(
                List.of(reg1,
                        reg2,
                        reg3,
                        reg4,
                        reg5)
        );

        Iterator<Regional> it = reg.iterator();
        while (it.hasNext()) {
            Regional train = it.next();
            if (train.getHasWifi() == false) {
                it.remove();
            }
        }

        Collections.sort(reg, (t1, t2) -> (int) Math.round(t1.getNumberOfStops() - t2.getNumberOfStops()));

        System.out.println("\nThe regional train that has WIFI and goes through the fewer stops is:");
        if (reg.isEmpty()) {
            System.out.println("None of the regional trains has WIFI.");
        } else {
            reg.get(0).printTrain();
        }


// inter print ----------------------------------------------------

        List<Intercity> inters = new ArrayList<>(
                List.of(inter1,
                        inter2,
                        inter3,
                        inter4,
                        inter5)
        );

        Iterator<Intercity> iter = inters.iterator();
        while (iter.hasNext()) {
            Intercity train = iter.next();
            if (!train.getSeatClass().equals("first")) {
                iter.remove();
            }
        }

        Collections.sort(inters, (t1, t2) -> (int) Math.round(t1.getTicketCostForRoute() - t2.getTicketCostForRoute()));
        System.out.println("\nThe intercity train that has First class seats and the most expensive ticket cost for his whole route is:");
        if (inters.isEmpty()) {
            System.out.println("None of the intercity trains has first class seats.");
        } else {
            inters.get(inters.size() - 1).printTrain();
        }

// departure and arrival time board

        System.out.println("-------------------------------------------------\n|\t\tTRAIN\t\t|\tDEPARTURE\t|\tARRIVAL\t|\n-------------------------------------------------");

        for (Train train : trainS.getTrains()) {
            System.out.println("|\tTrain number " + train.getTrainNumber() + "\t|\t " + train.getDepartureTime() + "\t\t|\t" + train.getArrivalTime() + "\t|");
        }
        System.out.println("-------------------------------------------------");



    }
}
