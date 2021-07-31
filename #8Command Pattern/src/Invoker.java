
// 燈光的遙控器，可以儲存commands。

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public  void removeCommand(Command command){
        commandList.remove(command);
    }

    public void execute()
    {
        for (Command command : commandList)
        {
            command.execute();
        }
        System.out.println("----------Which command in the list-------------");
        System.out.println(commandList);
    }

}
