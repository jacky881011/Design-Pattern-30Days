public class Client{
    public void Test(){
        DrinkShop drinkShop = new DrinkShop();

        Tea tea =(Tea)drinkShop.order("Tea", Drink.SugerType.FREE,Drink.IceType.EAZY);
        tea.setTeaType(Tea.TeaType.OOLONG);


        Coffee coffee =(Coffee)drinkShop.order("Coffrr",Drink.SugerType.QUARTER, Drink.IceType.EAZY);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);



    }
}
