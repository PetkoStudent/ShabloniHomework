import decorations.Decorations;
import eggs.DinosaurEgg;
import eggs.Egg;
import observers.LittleBirds;
import singleton.EasterBunny;

public class Application {
    public static void main(String[] args) {
        EasterBunny easterBunny = EasterBunny.getInstance();


        Egg dinoEgg = easterBunny.addEggsToBasket("DINOSAUR");
        easterBunny.addDecorationToEgg(dinoEgg);
        LittleBirds.message();

        Egg quailEgg = easterBunny.addEggsToBasket("QUAIL");
        easterBunny.addDecorationToEgg(quailEgg);
        LittleBirds.message();

        Egg quailEgg2 = easterBunny.addEggsToBasket("QUAIL");
        easterBunny.addDecorationToEgg(quailEgg2);
        LittleBirds.message();

        Egg dinoEgg2 = easterBunny.addEggsToBasket("DINOSAUR");
        easterBunny.addDecorationToEgg(dinoEgg2);
        LittleBirds.message();

        Egg chickenEgg = easterBunny.addEggsToBasket("CHICKEN");
        easterBunny.addDecorationToEgg(chickenEgg);
        LittleBirds.message();



    }
}
