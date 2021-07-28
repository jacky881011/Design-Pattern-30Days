package DiscountStrategy;

//****************************
//  折價策略的介面
//****************************

public abstract class IDiscountStrategy {               //設定抽象的類別
    double discount;
    // 先封閉建構子不讓其設定物件
    private IDiscountStrategy(){}

    public IDiscountStrategy(double discount){
        this.discount = discount;
    }

    abstract public double getValue(double discount);

}
