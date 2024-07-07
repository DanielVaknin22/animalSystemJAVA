package animals;

public class Alligator extends WaterAnimal {
    private String AreaOfLiving;

    public Alligator(Point location, String name, Gender gender, double weight, double speed, Medal[] medals, Point position, double diveDept, String AreaOfLiving){
        super(location, name, gender, weight, speed, medals, position, diveDept);
        this.AreaOfLiving = AreaOfLiving;
    }

    public String getAreaOfLiving() {
        return AreaOfLiving;
    }

    public void setAreaOfLiving(String areaOfLiving) {
        this.AreaOfLiving = areaOfLiving;
    }

    @Override
    protected String getSound() {
        return "Roar";
    }

    @Override
    public String toString() {
        return "Alligator{" +
                "AreaOfLiving='" + AreaOfLiving +
                "} " + super.toString();
    }
}
