/**
 * Classes and Objects example from http://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 */
public class Bicycle {
    // declare Bicycle's 3 fields (nonstatic fields)
    private int cadence;
    private int gear;
    private int speed;

    // The Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;
    }

    public getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void setBreaks(int decrement) {
        speed -= decrement;
    }

    public getSpeed() {
        return speed;
    }

    public void speedUp(int increment) {
        speed += increment;
    }



}
