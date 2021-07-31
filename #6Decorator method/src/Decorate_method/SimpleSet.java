package Decorate_method;

public class SimpleSet extends Set{
    private void addSet(){
        Salad salad = new Salad();
        Mainmeal mainmeal = new Mainmeal();
        Drink drink = new Drink();

        salad.decorate(order);
        mainmeal.decorate(salad);
        drink.decorate(mainmeal);

        this.order = drink;
    }

    @Override
    public void show(){
        addSet();
        super.show();
    }
}
