package Magic_Box_Practice;

// Concrete command

public class TurnLeft extends ICommandTetris{
    public TurnLeft(Tetris tetris){
        super(tetris);
    }

    @Override
    public void execute(){
        tetris.turnLeft();
    }
}
