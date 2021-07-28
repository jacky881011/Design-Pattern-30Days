import DiscountStrategy.MinusDiscount;
import DiscountStrategy.MultiplyStrategy;
import DiscountStrategy.NoneDiscount;
import DrinkType.Coffee;
import DrinkType.MilkTea;

public class Main_Test {
    public static void main(String args[]){
        DrinkOrder drinkOrder = new DrinkOrder();

        //Coffee coffee1 = new Coffee(165);
        //drinkOrder.addDrink(coffee1);

        //MilkTea milkTea1 = new MilkTea(55,new MinusDiscount(20));
        //drinkOrder.addDrink(milkTea1);

        drinkOrder.addDrink(new Coffee(165));
        drinkOrder.addDrink(new MilkTea(55,new MinusDiscount(20)));

        double price = drinkOrder.getTotalPrice(new NoneDiscount(1));

        //200
        System.out.println(price);

        //打九折
        price = drinkOrder.getTotalPrice(new MultiplyStrategy(0.9));
        System.out.println(price);

    }
}
