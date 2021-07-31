package Decorate_method;

public class Soup extends Item{
    private void addSoup(){
        System.out.println("Soup: one Soup");
    }

    @Override
    public void show(){
        super.show();
        addSoup();
    }
}
