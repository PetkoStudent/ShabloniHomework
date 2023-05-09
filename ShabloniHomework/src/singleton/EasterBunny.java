package singleton;

import decorations.Decorations;
import eggs.Egg;
import factories.EggFactory;
import observers.LittleBirds;

import java.util.Random;

public class EasterBunny {
    private static EasterBunny instance;

    private EasterBunny(){

    }

    public static EasterBunny getInstance(){
        if (instance==null){
            instance = new EasterBunny();
        }
        return instance;
    }

    public Egg addEggsToBasket(String eggType){
        EggFactory eggFactory = new EggFactory();
        Egg egg = eggFactory.getEgg(eggType);
        LittleBirds.setEggsInBasket();
        return egg;
    }
    public void addDecorationToEgg(Egg egg){
        Decorations decorations = new Decorations();
        Random random = new Random();
        int choice = random.nextInt(1,3);
        if(choice == 1){
            decorations.addColor(egg);
        }
        if(choice == 2){
            decorations.addStickers(egg);
        }
    }
}
