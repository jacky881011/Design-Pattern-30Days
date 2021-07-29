package Decorate_method;
// 這時候如果要實現套餐，套餐內部可以用裝飾模式實現，自由度就大很多。

public class Set extends Order{
    protected Order order;

    public void decorate(Order order){
        this.order = order;
    }

    @Override
    public void show(){
        if( order != null){
            order.show();
        }
    }

}
