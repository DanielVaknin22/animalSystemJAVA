package Olympics;

public class Medal {
    public enum Type {
        bronze, silver, gold
    }
    private Type type;
    private String tournament;
    private int year;

    public Medal (Type type, String tournament, int year) {
        this.type = type;
        this.tournament = tournament;
        this.year = year;
    }
    public void setType (Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    public String getTournament() {
        return tournament;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Medal{" +
                "type=" + type +
                ", tournament='" + tournament + '\'' +
                ", year=" + year +
                '}';
    }
}
