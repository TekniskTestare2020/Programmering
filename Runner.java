package se.stuff;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        FruitBag fruitBag = new FruitBag();

        fruitBag.addFruitToBag(new Apple());
        fruitBag.addFruitToBag(new Pear());

        List<Fruit> fruits = fruitBag.getFruitBag();

        Bag bag = new Bag();

        for (Fruit fruit : fruits) {

            if (((Eatable) fruit).isEatable()) {
                System.out.println(fruit.getClass().getSimpleName());
                bag.addToBag((Eatable) fruit);

                System.out.println("you can eat it! :)");
            } else

                System.out.println("don't eat");

            }

        }
    }
