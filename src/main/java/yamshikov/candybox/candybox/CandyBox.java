package yamshikov.candybox.candybox;

import yamshikov.candybox.candy.Candy;

import java.util.ArrayList;
import java.util.List;

public class CandyBox {

    private List<Candy> candyBox = new ArrayList<>();
    private double priceBox;
    private double weightBox;

    public CandyBox(Candy... candies) {
        for (Candy candy : candies) {
            priceBox += candy.getPrice();
            weightBox += candy.getWeight();
            candyBox.add(candy);
        }
    }

    public void addCandyInBox(Candy candy) {
        candyBox.add(candy);
        priceBox += candy.getPrice();
        weightBox += candy.getWeight();
    }

    public double getPriceBox() {
        return priceBox;
    }

    public double getWeightBox() {
        return weightBox;
    }

    @Override
    public String toString() {
        return "CandyBox = [" + candyBox + "]";
    }
}
