package Decorate_method;

// 餐點當成是修飾者 (Order當成是元件的一種)

public class Item extends Order{
    protected Order order ;

    public void decorate(Order order){
        this.order = order;

    }

    @Override
    public void show(){
        if(order != null){
            order.show();
        }
    }


}
