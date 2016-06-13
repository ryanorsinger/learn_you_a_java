class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    protected void finalize() {
        System.out.println("finalize method was called. Finalize is similar but not the same as a destructor.");
        System.out.println("Destructors are always called before an object goes out of scope.");
        System.out.println("Finalize() runs right before the object is recycled by garbage collection.");
        System.out.println("If the program ends before garbage collection occurs, finalize() will not execute");
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);

        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int distance = 252;

        System.out.print("The minivan can carry " + minivan.passengers + ". ");
        minivan.range();

        System.out.print("The sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();

        gallons = minivan.fuelneeded(distance);
        System.out.println("To go " + distance + " miles, the minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(distance);
        System.out.println("To go " + distance + " miles, the sportscar needs " + gallons + " gallons of fuel.");
    }
}

