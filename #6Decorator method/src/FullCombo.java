public class FullCombo extends  SimpleCombo {

    public FullCombo(Restaurant restaurant){
        super(restaurant);
    }

    private void dessert(){
        System.out.println("Add : You have a dessert!");
    }

    @Override
    public void order(){
        super.order();
        dessert();
    }




}
