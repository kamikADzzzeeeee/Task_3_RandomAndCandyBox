package yamshikov.candybox.candy;

import java.util.UUID;

public abstract class Candy {
    private String name;
    private double price;
    private double weight;
    private final UUID uuid = UUID.randomUUID();

    public Candy() {
    }

    public Candy(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

}
