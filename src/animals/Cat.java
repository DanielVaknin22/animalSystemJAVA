package animals;
import mobility.Point;
import Olympics.Medal;
public class Cat extends TerrestrialAnimals {
    private boolean castrated;
    public Dog(Point location,String name, Gender gender, double weight, double speed, Medal[] medals, Point position, int noLegs, boolean castrated){
        super(location, name, gender, weight, speed, medals, position, noLegs);
        this.castrated = castrated;
    }

    public boolean isCastrated() {
        return castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    @Override
    protected String getSound() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "TerrestrialAnimal{" +
                ", castrated=" + castrated +
                "}" + super.toString();
    }
}