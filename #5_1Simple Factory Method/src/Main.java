import Player.Adventure;

public class Main {
    public static void main(String args[]){
        //新手村訓練冒險者
        Adventure member1 = TrainingCamp.trainAdventurer("Archer");
        System.out.println(member1.getType());

        Adventure member2 = TrainingCamp.trainAdventurer("Warrior");
        System.out.println(member2.getType());




    }
}
