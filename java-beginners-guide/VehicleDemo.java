class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int distance = 252;
        int range1, range2;

        // assign values to minivan object
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("The minivan can carry " + minivan.passengers + ". ");
        minivan.range();

        System.out.print("The sportscar can carry" + sportscar.passengers + ". ");
        sportscar.range();

        gallons = minivan.fuelneeded(distance);
        System.out.println("To go " + distance + " miles, the minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(distance);
        System.out.println("To go " + distance + " miles, the sportscar needs " + gallons + " gallons of fuel.");
    }
}

