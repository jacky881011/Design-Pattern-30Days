public class Main {
    public static void main(String args[]){
        Facade facade = new Facade();
        System.out.println("Method A");
        facade.MethodA();

        System.out.println("Method B");
        facade.MethodB();
    }
}
