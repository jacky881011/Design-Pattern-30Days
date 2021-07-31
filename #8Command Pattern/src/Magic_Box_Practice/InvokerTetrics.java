package Magic_Box_Practice;

public class InvokerTetrics {
    ICommandTetris iCommandTetris;

    public InvokerTetrics(){}

    public InvokerTetrics(ICommandTetris iCommandTetris){
        this.iCommandTetris = iCommandTetris;
    }

    public void setCommand(ICommandTetris iCommandTetris){
        this.iCommandTetris = iCommandTetris;
    }

    public void invoke(){
        iCommandTetris.execute();
    }
}
