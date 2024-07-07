package animals;

public abstract class AirAnimal extends Animal {
    private double wingspan;

    public AirAnimal(String name, Gender gender, double weight, double speed, Medal[] medals, Point position, double wingspan){
        super(new Point(0, 100), name, gender, weight, speed, medals, position);
        this.wingspan = wingspan;

    }
    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
    @Override
    public String toString() {
        return "AirAnimal{" +
                "wingspan=" + wingspan +
                "} " + super.toString();
    }
}