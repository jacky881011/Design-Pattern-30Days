package DiscountStrategy;

//****************************
//  減價的策略
//****************************


public class MinusDiscount extends IDiscountStrategy{

    public MinusDiscount(double discount){
        super(discount);                    //  this.discount = discount
    }

    @Override           // 繼承抽象類別後，要記得覆蓋其方法
    public double getValue(double value){
        return  value - discount;
    }



}
