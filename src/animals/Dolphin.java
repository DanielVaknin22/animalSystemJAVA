package animals;

public class Dolphine extends WaterAnimal {
    public enum WaterType {
        Sea, Sweet
    }
    private WaterType waterType;

    public Dolphine(Point location, String name, Gender gender, double weight, double speed, Medal[] medals, Point position, double diveDept, String WaterType){
        super(location, name, gender, weight, speed, medals, position, diveDept);
        this.WaterType = WaterType;
    }

    public void setWaterType(animals.Dolphine.WaterType waterType) {
        this.waterType = waterType;
    }

    public animals.Dolphine.WaterType getWaterType() {
        return waterType;
    }

    @Override
    protected String getSound() {
        return "Click-click";
    }

    @Override
    public String toString() {
        return "Dolphine{" +
                "WaterType='" + WaterType +
                "} " + super.toString();
    }
}
