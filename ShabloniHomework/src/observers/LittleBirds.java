package observers;

public class LittleBirds {
    private static int eggsInBasket=0;

    public static void message(){
        if(eggsInBasket == 5){
            System.out.println("Eggs are ready!");
            eggsInBasket = 0;
        }
        else {
            System.out.println(eggsInBasket + " eggs in basket");
        }
    }

    public static int getEggsInBasket() {
        return eggsInBasket;
    }

    public static void setEggsInBasket() {
        LittleBirds.eggsInBasket++;
    }
}
