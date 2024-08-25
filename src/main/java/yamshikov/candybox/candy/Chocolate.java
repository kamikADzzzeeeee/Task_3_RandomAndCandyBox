package yamshikov.candybox.candy;

public class Chocolate extends Candy {

    private String countryOfOrigin;

    public Chocolate() {
        super();
    }

    public Chocolate(String name, double price, double weight, String countryOfOrigin) {
        super(name, price, weight);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Chocolate " + super.toString() + ", countryOfOrigin = " + this.countryOfOrigin;
    }
}
