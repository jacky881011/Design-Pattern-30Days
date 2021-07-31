package Magic_Box_Practice;

// Concrete command

public class TurnRight extends ICommandTetris{

    public TurnRight(Tetris tetris){
        super(tetris);
    }


    @Override
    public void execute(){
        tetris.turnRight();
    }
}
