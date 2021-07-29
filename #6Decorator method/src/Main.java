
// 測試一下

import Decorate_method.*;

public class Main {
    public static void main(String args[]){
       Restaurant restaurant = new Restaurant();

       SimpleCombo simpleCombo = new SimpleCombo(restaurant);
       System.out.println("------SimpleCombo------ ");
       simpleCombo.order();

       FullCombo fullCombo = new FullCombo(restaurant);
       System.out.println("------FullCombo--------");
       fullCombo.order();

       BusinessLunch businessLunch = new BusinessLunch(restaurant);
       System.out.println("----------BusinessLunch---------");
       businessLunch.order();

       System.out.println("\n\n\n");
       //--------------- Decorate by Item , and component by Order ---------------------

       Order order = new Order();

       Drink drink = new Drink();
       Mainmeal mainmeal = new Mainmeal();
       Soup soup = new Soup();

       drink.decorate(order);
       mainmeal.decorate(drink);
       soup.decorate(mainmeal);

       soup.show();

       System.out.println("\n\n\n");
       // ====================Add Simple Set===============================
       SimpleSet simpleSet =new SimpleSet();
       simpleSet.show();














    }
}
