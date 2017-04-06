package by.parf.domain;

/**
 * Created by Kiryl_Parfiankou on 4/6/2017.
 */
public class Auditorium {

    private String name;
    private int numberOfSeats;
    private int vipSeats;

    public Auditorium() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getVipSeats() {
        return vipSeats;
    }

    public void setVipSeats(int vipSeats) {
        this.vipSeats = vipSeats;
    }
}
