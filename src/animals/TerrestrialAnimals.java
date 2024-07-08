package animals;
import mobility.Point;
import Olympics.Medal;
public abstract class TerrestrialAnimals extends Animal {
    private int noLegs;
    public TerrestrialAnimals(String name, Gender gender, double weight, double speed, Medal[] medals, Point position, int noLegs){
        super(new Point(0, 20), name, gender, weight, speed, medals, position);
        this.noLegs = noLegs;
    }
    public int getNoLegs() {
        return noLegs;
    }
    public void setNoLegs(int noLegs) {
        this.noLegs = noLegs;
    }
    @Override
    public String toString() {
        return "TerrestrialAnimals{" +
                "noLegs=" + noLegs +
                "} " + super.toString();
    }
}