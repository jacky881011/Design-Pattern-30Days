package Decorate_method;

public class Drink extends Item{
    private void addDrink(){
        System.out.println("Drink: one drink");
    }

    @Override
    public void show(){
        super.show();
        addDrink();
    }

}
