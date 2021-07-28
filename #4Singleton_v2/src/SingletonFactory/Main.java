package SingletonFactory;

public class Main {
    public static void main(String args[]){
        Cola cola =(Cola) SingletonFactory.getColaFactory().getProduct();
        Hamburger hamburger =(Hamburger) SingletonFactory.getHumbergerFactory().getProduct();

        System.out.println(cola.getName());
        System.out.println(hamburger.getName());




    }
}
