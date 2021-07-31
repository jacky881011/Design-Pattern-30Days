
// 有一間餐廳 (介面)

public class Restaurant {

    public void low_cost_Drink(){
        System.out.println("You must get a drink!");
    }

    public void order(){
        low_cost_Drink();
    }
}
