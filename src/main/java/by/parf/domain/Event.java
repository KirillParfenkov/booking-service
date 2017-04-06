package by.parf.domain;

/**
 * Created by Kiryl_Parfiankou on 4/6/2017.
 */
public class Event {

    private String id;
    private int basePrice;
    private Rating rating;

    public Event() {
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
}
