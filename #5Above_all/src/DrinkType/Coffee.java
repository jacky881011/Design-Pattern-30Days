package DrinkType;

import DiscountStrategy.IDiscountStrategy;

public class Coffee extends Drink{

    //  沒有折扣
    public Coffee(double value){
        super(value);
    }

    //  含有折扣
    public Coffee(double value , IDiscountStrategy discountStrategy){
        super(value , discountStrategy);
    }

    @Override
    public double getValue(){
        return super.getValue();            // 繼承該方法的方式用 super.method_name
    }
}
