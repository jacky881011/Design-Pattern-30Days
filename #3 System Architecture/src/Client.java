public class Client{
    public void Test(){
        DrinkShop drinkShop = new DrinkShop();

        Tea tea =(Tea)drinkShop.order("Tea", Drink.SugerType.FREE,Drink.IceType.EAZY);
        tea.setTeaType(Tea.TeaType.OOLONG);


        Coffee coffee =(Coffee)drinkShop.order("Coffrr",Drink.SugerType.QUARTER, Drink.IceType.EAZY);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);

        String Tea_order;
        Tea_order = "You are order "+ tea.getTeaType()+"\n"+tea.getSuger() +"\n"+tea.getIce();
        System.out.println(Tea_order);

        String Coffee_order;
        Coffee_order = "You are order "+ coffee.getCoffeeType()+"\n"+coffee.getSuger() +"\n"+coffee.getIce();
        System.out.println(Coffee_order);


    }
}
