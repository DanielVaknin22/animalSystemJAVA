package animals;

public class Eagle extends AirAnimal {
    private double altitudeOfFlight;
    public static final int MAX_ALTITUDE = 1000;
    public Eagle(Point location, String name, Gender gender, double weight, double speed, Medal[] medals, Point position, double wingspan, double altitudeOfFlight){
        super(location, name, gender, weight, speed, medals, position, wingspan);
        this.altitudeOfFlight = altitudeOfFlight;
    }

    public double getAltitudeOfFlight() {
        return altitudeOfFlight;
    }
    public void setAltitudeOfFlight(double altitudeOfFlight) {
        if (altitudeOfFlight >= MAX_ALTITUDE) {
            this.altitudeOfFlight = altitudeOfFlight;
        } else {
            System.out.println("altitude Of Flight cannot be deeper than " + MAX_ALTITUDE);
        }
    }

    @Override
    protected String getSound() {
        return "Clack-wack-chack";
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "altitudeOfFlight='" + altitudeOfFlight +
                "MAX_ALTITUDE=" + MAX_ALTITUDE +
                "} " + super.toString();
    }
}