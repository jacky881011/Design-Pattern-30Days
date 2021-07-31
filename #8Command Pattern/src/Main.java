import Magic_Box_Practice.*;

public class Main {
    public static void main(String args[]){

        //----------------Light Test------------------------------
        Light light = new Light();


        Command turnOn = new TurnOn(light);
        Command turnOff = new TurnOff(light);
        Command brighter = new Brighter(light);
        Command darker = new Darker(light);

        Invoker invoker = new Invoker();

        invoker.addCommand(turnOn);
        invoker.addCommand(turnOff);
        invoker.addCommand(brighter);
        invoker.addCommand(darker);

        invoker.execute();
        invoker.removeCommand(darker);
        System.out.println("");
        invoker.execute();

        //---------------Magic Box Test------------------------------
        System.out.println("\n\n\n");
        Tetris tetris = new Tetris();
        ICommandTetris straightDown = new StraightDown(tetris);
        ICommandTetris turnLeft = new TurnLeft(tetris);
        ICommandTetris turnRight = new TurnRight(tetris);

        InvokerTetrics invokerTetrics = new InvokerTetrics();
        invokerTetrics.setCommand(straightDown);
        invokerTetrics.invoke();

        invokerTetrics.setCommand(turnLeft);
        invokerTetrics.invoke();

        invokerTetrics.setCommand(turnRight);
        invokerTetrics.invoke();

        InvokerTetrics invokerTetrics2 = new InvokerTetrics(straightDown);
        invokerTetrics2.invoke();






    }
}
