package DrinkType;

import DiscountStrategy.IDiscountStrategy;

public class MilkTea extends  Drink{
    public MilkTea(double value){
        super(value);
    }

    public MilkTea(double value , IDiscountStrategy discountStrategy){
        super(value , discountStrategy);           // 繼承該物件的任何屬性
    }

    @Override
    public double getValue(){
        return super.getValue();        //回傳數值
    }
}
