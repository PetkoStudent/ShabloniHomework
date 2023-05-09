package factories;

import eggs.ChickenEgg;
import eggs.DinosaurEgg;
import eggs.Egg;
import eggs.QuailEgg;

public class EggFactory {
    public Egg getEgg(String eggType) {
        if (eggType.equals("DINOSAUR")) {
            System.out.println("Producing new dinosaur egg");
            return new DinosaurEgg();
        }
        if (eggType.equals("CHICKEN")) {
            System.out.println("Producing new chicken egg");
            return new ChickenEgg();
        }
        if (eggType.equals("QUAIL")) {
            System.out.println("Producing new quail egg");
            return new QuailEgg();
        }
        return null;
    }
}

