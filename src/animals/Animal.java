package animals;
import mobility.Mobile;
import mobility.Point;
import Olympics.Medal;

import java.util.Arrays;

public abstract class Animal extends Mobile {
    public enum Gender {
        Male, Female, Hermaphrodite
    }
    private String name;
    private Gender gender;
    private double weight;
    private double speed;
    private Medal[] medals;
    private Point position;

    public Animal(Point location, String name, Gender gender, double weight, double speed, Medal[] medals, Point position) {
        super(location);
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = speed;
        this.medals = new Medal[medals.length];
        for (int i = 0; i < medals.length; i++) {
            this.medals[i] = medals[i];
        }
        this.position = position;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    public Medal[] getMedals() {
        return medals;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMedals(Medal[] medals) {
        this.medals = new Medal[medals.length];
        for (int i = 0; i < medals.length; i++) {
            this.medals[i] = medals[i];
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    protected abstract String getSound();
    public void makeSound() {
        System.out.println("Animal " + name + " said " + getSound());
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                ", speed=" + speed +
                ", medals=" + Arrays.toString(medals) +
                ", position=" + position +
                '}';
    }
}