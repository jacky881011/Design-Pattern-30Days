import DiscountStrategy.IDiscountStrategy;
import DrinkType.Drink;

import java.util.ArrayList;
import java.util.List;


public class DrinkOrder {

    //放飲料的 list
    private List<Drink> drinkList = new ArrayList<Drink>();

    //加入飲料 放入的為物件
    public void addDrink(Drink drink){
        drinkList.add(drink);
    }

    //移除飲料
    public void removeDrink(Drink drink){
        drinkList.remove(drink);
    }

    //飲料總價錢計算 (私有方法處理)
    private double totalPrice(){
        double total_price = 0;

        for(Drink drink_type : drinkList){          // 求出每一個物件的價錢資料
            total_price += drink_type.getValue();
        }

        return total_price;
    }

    //訂單總價錢整理 (總額折扣等)
    public double getTotalPrice(IDiscountStrategy discountStrategy){
        double totalPrice = totalPrice();           // totalPrice為回傳的總額

        return  discountStrategy.getValue(totalPrice);

    }
}
