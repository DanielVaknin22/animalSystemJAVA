package animals;
import mobility.Point;
import Olympics.Medal;
public class Dog extends TerrestrialAnimals {
    private String breed;
    public Dog(Point location,String name, Gender gender, double weight, double speed, Medal[] medals, Point position, int noLegs, String breed){
        super(location, name, gender, weight, speed, medals, position, noLegs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    protected String getSound() {
        return "Woof Woof";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed +
                "} " + super.toString();
    }
}