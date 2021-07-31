public class DrinkShop {   // the main order
    public Drink order(String drink , Drink.SugerType suger , Drink.IceType ice){
        drink.toLowerCase();

        switch(drink){
            case "coffee":
                return new Coffee(suger , ice);

            case "tea":
                return new Tea(suger , ice);

            default:
                return null;
        }
    }
}
