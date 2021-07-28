package Training_camp;

import Adventurer_type.Adventurer;
import Adventurer_type.Warrior;

/**
 * 戰士訓練營(ConcreteFactory)
 */

public class WarriorTrainingCamp implements TrainingCamp{
    @Override
    public Adventurer trainAdventurer(){
        System.out.println("訓練一個貼身的戰士");
        return new Warrior();                       //回傳物件給Training Camp
    }

}
