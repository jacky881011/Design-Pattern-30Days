package Training_camp;

import Adventurer_type.Adventurer;
import Adventurer_type.Archer;


/**
 * 弓箭手訓練營(ConcreteFactory)
 */

public class ArcherTrainingCamp implements TrainingCamp{

    @Override
    public Adventurer trainAdventurer(){
        System.out.println("訓練一個遠距離的弓箭手");
        return new Archer();
    }
}
