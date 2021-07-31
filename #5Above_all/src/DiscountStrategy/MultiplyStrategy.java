package DiscountStrategy;

//****************************
//  折價的策略
//****************************

public class MultiplyStrategy extends IDiscountStrategy{

    public MultiplyStrategy(double discount){
        super(discount);
    }

    @Override
    public double getValue(double value){
        return value * discount;
    }
}
