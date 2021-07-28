import Player.Adventure;
import Player.Archer;
import Player.Warrior;

/**
 * 冒險者訓練營(SimpleFactor)
 */

public class TrainingCamp {
    public static Adventure trainAdventurer(String type){       //Adventure就是簡單的工廠，判斷是需要哪一種物件 (新手)
        type = type.toLowerCase();
        switch(type){
            case "archer":
                System.out.println("訓練一個弓箭手");
                return new Archer();    // (回傳一個Archer的物件)

            case "warrior":
                System.out.println("訓練一個戰士");
                return new Warrior();  // ( 回傳一個Warrior的物件)

            default: return null;
        }

    }
}
