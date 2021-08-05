
// Client doAction

public class Main {
    public static void main(String args[]){
        IBuyHouse littleEngineer = new LittleEngineer();
        IBuyHouse richPerson = new RichPerson();

        IBuyHouse estateAgent = new EstateAgent(littleEngineer);
        IBuyHouse estateAgent2 = new EstateAgent(richPerson);


        estateAgent.findHouse();
        estateAgent.priceTooHigh();
        estateAgent.defendPrice();
        estateAgent.finish();

        System.out.println("\n");

        estateAgent2.findHouse();
        estateAgent2.priceTooHigh();
        estateAgent2.defendPrice();
        estateAgent2.finish();


    }
}
