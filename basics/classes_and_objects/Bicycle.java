/**
 * Classes and Objects example from http://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 */
public class Bicycle {
    // declare Bicycle's 3 fields (nonstatic fields)
    public int cadence;
    public int gear;
    public int speed;

    // The Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;
    }
    
    public void setCadence(int newValue) {
        cadence = newValue;
    }
    
    public void setGear(int newValue) {
        gear = newValue;
    }
    
    public void setBreaks(int decrement) {
        speed -= decrement;
    }
    
    public void speedUp(int increment) {
        speed += increment;
    }
          
}
