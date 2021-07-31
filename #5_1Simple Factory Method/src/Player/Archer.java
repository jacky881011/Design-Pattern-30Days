package Player;
// ------------------弓箭手 (Concrete Product)----------------------------'

import Player.Adventure;

public class Archer implements Adventure {

    @Override
    public String getType(){
        String type = "我是個弓箭手";
        return type;
    }
}
