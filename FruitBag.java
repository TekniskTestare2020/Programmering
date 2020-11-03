package se.stuff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FruitBag {

    private List<Fruit> fruits = new ArrayList<Fruit>();

    public void addFruitToBag(Fruit fruit) {
        fruits.add(fruit);
    }

    public List<Fruit> getFruitBag() {

            return this.fruits;
    }

}
