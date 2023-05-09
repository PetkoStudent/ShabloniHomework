package decorations;

import eggs.Egg;

public class Decorations implements Egg {
    @Override
    public void produce() {

    }
    public void addColor(Egg egg){
        System.out.println("Egg was colored");
    }
    public void addStickers(Egg egg){
        System.out.println("Stickers put on egg");
    }
}
