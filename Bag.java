package se.stuff;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Eatable> eatables = new ArrayList<Eatable>();

    public void addToBag(Eatable fruit) {

        eatables.add(fruit);
    }

    private List<Eatable> getBag() {
        return eatables;

    }
}
