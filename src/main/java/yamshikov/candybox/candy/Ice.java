package yamshikov.candybox.candy;

public class Ice extends Candy {
    private String flavor;

    public Ice() {
        super();
    }

    public Ice(String name, double price, double weight, String flavor) {
        super(name, price, weight);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Ice " + super.toString() + ", flavor = " + this.flavor;
    }

}
