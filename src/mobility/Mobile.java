package mobility;

public abstract class Mobile implements ILocatable {
    private Point location;
    private double totalDistance;

    public Mobile (Point location) {
        this.location = location;
        this.totalDistance = 0.0;
    }
    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }
    public double getTotalDistance() {
        return totalDistance;
    }
    @Override
    public Boolean setLocation(Point location) {
        if (location.getX() < 0 || location.getY() < 0) {
            return false;
        }
        addTotalDistance(calcDistance(location));
        this.location = location;
        return true;
    }
    @Override
    public Point getLocation() {
        return location;
    }

    public void addTotalDistance(double distance) {
        if(distance > 0) {
            totalDistance += distance;
        }
    }
    public double calcDistance(Point point) {
        return location.distance(point);
    }
    public double move(Point point){
        if (setLocation(point)) {
            return calcDistance(point);
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "location=" + location +
                ", totalDistance=" + totalDistance +
                '}';
    }

}
