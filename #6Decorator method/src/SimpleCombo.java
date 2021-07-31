
// 簡餐多了湯品

public class SimpleCombo extends  BusinessLunch{
    public SimpleCombo(Restaurant restaurant){
        super(restaurant);
    }

    private void soup(){
        System.out.println("Add : You have one soup!");
    }

    @Override
    public void order(){
        super.order();
        soup();
    }

}
