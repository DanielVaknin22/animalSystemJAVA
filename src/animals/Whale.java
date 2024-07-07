package animals;

public class Whale extends WaterAnimal {
    private String foodType;

    public Whale(Point location, String name, Gender gender, double weight, double speed, Medal[] medals, Point position, double diveDept, String foodType){
        super(location, name, gender, weight, speed, medals, position, diveDept);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    protected String getSound() {
        return "Splash";
    }

    @Override
    public String toString() {
        return "Whale{" +
                "foodType='" + foodType +
                "} " + super.toString();
    }
}
