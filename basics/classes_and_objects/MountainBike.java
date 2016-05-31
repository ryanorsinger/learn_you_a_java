public class MountainBike extends Bicycle {
    // The mountain bike subclass has one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    // super sets inheritance and then additional code extends
    public MountainBike(int startHeight, int startCadence, int startGear, int startSpeed) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

}
