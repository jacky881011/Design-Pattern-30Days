package Decorate_method;

public class Mainmeal extends Item{
    private void addMainMeal(){
        System.out.println("Main Meal: one main meal");
    }

    @Override
    public void show(){
        super.show();
        addMainMeal();
    }

}
