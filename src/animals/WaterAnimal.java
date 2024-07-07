package animals;

public abstract class WaterAnimal extends Animal {
    public static final int MAX_DIVE = -800;
    private double diveDept;

    public WaterAnimal(String name, Gender gender, double weight, double speed, Medal[] medals, Point position, double diveDept){
        super(new Point(50, 0), name, gender, weight, speed, medals, position);
        this.diveDept = diveDept;
    }
    public double getDiveDept() {
        return diveDept;
    }
    public void setDiveDepth(double diveDepth) {
        if (diveDepth >= MAX_DIVE) {
            this.diveDepth = diveDepth;
        } else {
            System.out.println("Dive depth cannot be deeper than " + MAX_DIVE);
        }
    }
    public void Dive(double diveDept){
        if(this.diveDept + diveDept >= MAX_DIVE)
            this.diveDept += diveDept;
        else
            System.out.println("Dive depth cannot be deeper than " + MAX_DIVE);
    }
    @Override
    public String toString() {
        return "WaterAnimal{" +
                "diveDepth=" + diveDepth +
                "} " + super.toString();
    }
}