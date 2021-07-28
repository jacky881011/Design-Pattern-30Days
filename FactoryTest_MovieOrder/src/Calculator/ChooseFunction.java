package Calculator;

public class ChooseFunction {
    public static FunctionSelect chooseFunction(String function){
        function = function.toLowerCase();
        switch (function){
            case "add":
                System.out.println("You select add function");
                return  new add();
            case "minus":
                System.out.println("You select minus function");
                return  new minus();
            case "divide":
                System.out.println("You select divide function");
                return new divide();
            case "multiply":
                System.out.println("You select multiply function.");
                return new multiply();
            default: return null;
        }
    }
}
