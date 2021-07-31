package Magic_Box_Practice;

public abstract class ICommandTetris {
    protected Tetris tetris;

    public ICommandTetris(Tetris tetris)
    {
        this.tetris  = tetris;
    }


    public abstract void execute();
}
