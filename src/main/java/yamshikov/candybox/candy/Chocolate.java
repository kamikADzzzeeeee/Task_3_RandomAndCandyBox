package yamshikov.candybox.candy;

public class Chocolate extends Candy {

    public Chocolate() {
        super();
    }

    public Chocolate(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public String toString() {
        return "Chocolate " + super.toString();
    }
}
