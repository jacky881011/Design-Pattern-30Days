package DiscountStrategy;

//****************************
//  不折價的策略
//****************************

public class NoneDiscount extends IDiscountStrategy {

    public NoneDiscount(double discount){
        super(discount);
    }

    @Override
    public double getValue(double value){
        return  value;
    }



}
