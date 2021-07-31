package Decorate_method;

public class Salad extends Item{
    private void addSalad(){
        System.out.println("Salad: one salad");
    }

    @Override
    public void show(){
        super.show();
        addSalad();
    }
}
