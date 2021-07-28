package DrinkType;

//****************************
//  飲料的介面
//****************************

import DiscountStrategy.IDiscountStrategy;      //需要引入在package中的 類別
import DiscountStrategy.NoneDiscount;

//****************************
//  飲料的介面
//****************************

public abstract class Drink {
    IDiscountStrategy discountStrategy = new NoneDiscount(1);       //一開始宣告的物件是非折價的  所以先將此物件設成 NoneDiscount的

    double value;

    // 單例化
    private Drink(){}

    //  沒有折扣
    public Drink(double value){
        this.value = value;
    }

    //  含有折扣
    public Drink(double value , IDiscountStrategy discountStrategy){        // 輸入折價多少錢，且要用什麼模式去處理
        this.value = value;
        this.discountStrategy = discountStrategy;
    }

    // 回傳打折後的結果
    public double getValue(){
        return discountStrategy.getValue(value);        // get the value by using object from each class
    }

}
