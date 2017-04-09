package by.parf.domain;

/**
 * Created by Kiryl_Parfiankou on 4/6/2017.
 */
public class Event {

    private String id;
    private String name;
    private int basePrice;
    private Rating rating;

    public Event() {
    }

    public Event(String name, int basePrice, Rating rating) {
        this.name = name;
        this.basePrice = basePrice;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
