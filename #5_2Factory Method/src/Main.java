import Adventurer_type.Adventurer;
import Training_camp.ArcherTrainingCamp;
import Training_camp.TrainingCamp;
import Training_camp.WarriorTrainingCamp;

public class Main {
    public static void main(String args[]){
        System.out.println("================工廠模式測試====================");


        TrainingCamp trainingCamp = new ArcherTrainingCamp();
        Adventurer memberA = trainingCamp.trainAdventurer();
        System.out.println(memberA.getType());

        TrainingCamp trainingCamp2 = new WarriorTrainingCamp();
        Adventurer member2 = trainingCamp2.trainAdventurer();
        System.out.println(member2.getType());


    }
}
