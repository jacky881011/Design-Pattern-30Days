package Player;
// ------------------戰士 (Concrete Product)----------------------------

import Player.Adventure;

public class Warrior implements Adventure {
    @Override
    public String getType(){
        String type = "我是個戰士";

        return type;
    }
}
