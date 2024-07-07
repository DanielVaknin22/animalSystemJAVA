package animals;

public class Pigeon extends AirAnimal {
    private String family;
    public Pigeon(Point location, String name, Gender gender, double weight, double speed, Medal[] medals, Point position, double wingspan, String family){
        super(location, name, gender, weight, speed, medals, position, wingspan);
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    protected String getSound() {
        return "Arr-rar-rar-rar-raah";
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "family='" + family +
                "} " + super.toString();
    }
}