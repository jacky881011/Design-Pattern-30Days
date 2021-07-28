public class Main {
    public static void main(String args[]){
        Tea tea1 = new Tea(Drink.SugerType.FREE, Drink.IceType.HOT);
        tea1.setTeaType(Tea.TeaType.GINGER);
        tea1.Show_Tea();

        Coffee coffee1 = new Coffee(Drink.SugerType.QUARTER, Drink.IceType.EAZY);
        coffee1.setCoffeeType(Coffee.CoffeeType.ATTE);
        coffee1.Show_coffee();


    }
}
