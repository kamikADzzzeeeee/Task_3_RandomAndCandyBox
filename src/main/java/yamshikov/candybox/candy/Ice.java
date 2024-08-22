package yamshikov.candybox.candy;

public class Ice extends Candy{

    public Ice() {
        super();
    }

    public Ice(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public String toString(){
        return "Ice " + super.toString();
    }

}
