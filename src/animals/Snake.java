package animals;

import Olympics.Medal;
import mobility.Point;
public class Snake extends TerrestrialAnimals {
    public enum Poisonous  {
        NOT_POISONOUS, MILDLY_POISONOUS, HIGHLY_POISONOUS
    }
    private Poisonous poisonous;
    private double length;
    public Snake(Point location,String name, Gender gender, double weight, double speed, Medal[] medals, Point position, int noLegs, double length){
        super(location, name, gender, weight, speed, medals, position, noLegs);
        this.length = length;
        this.poisonous = poisonous;
    }

    public double getLength() {
        return length;
    }

    public Poisonous getPoisonous() {
        return poisonous;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPoisonous(Poisonous poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    protected String getSound() {
        return "ssssssss";
    }

    @Override
    public String toString() {
        return "Snake{" +
                ", poisonous=" + poisonous +
                ", length=" + length +
                "}" + super.toString();
    }
}