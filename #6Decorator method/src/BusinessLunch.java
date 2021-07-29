
// 商業午餐除了飲料還有沙拉跟主餐

public class BusinessLunch extends Restaurant{
    private Restaurant restaurant;

    public BusinessLunch(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    private void salad(){
        System.out.println("One plate of salad!");
    }

    private void entree(){
        System.out.println("One of main meal!");
    }

    @Override
    public void order(){
        super.order();  //繼承原先restaurant的方法

        salad();
        entree();


    }

}
