import java.security.Key;

// Product

public class MacbookPro {
    private Processor processor;
    private Memory memory;
    private Storage storage;
    private Graphics graphics;
    private Keyboard keyboard;

    MacbookPro(){}

    //-------------------set the object from each Class--------------------
    public void setProcessor(Processor processor){
        this.processor = processor;
    }

    public void setMemory(Memory memory){
        this.memory = memory;
    }

    public void setStorage(Storage storage){
        this.storage = storage;
    }

    public void  setGraphics(Graphics graphics){
        this.graphics = graphics;
    }

    public void setKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
    }

    //------------------get the object from each class------------------------
    public Processor getProcessor(){
        return processor;
    }

    public Memory getMemory(){
        return memory;
    }

    public Storage getStorage(){
        return storage;
    }

    public Graphics getGraphics(){
        return graphics;
    }

    public Keyboard getKeyboard(){
        return  keyboard;
    }

    //--------------------Show the type of the Macbook------------------------
    @Override
    public String toString()
    {
        return "{ Macbook : "+"\n"+
                "Processor :" + this.getProcessor().name+"\n"+
                "Memory Size : "+this.getMemory().size+"\n"+
                "Graphics : "+this.getGraphics().name+"\n"+
                "Storage Size : "+this.getStorage().size+"\n"+
                "Keyboard language : "+this.getKeyboard().language+" } ";
    }



    //---------------------Each type of class-----------------------------
    public static class Processor{
        String name;
        Processor(String name){
            this.name = name;
        }
    }

    public static class Memory{
        int size;
        Memory(int size){
            this.size = size;
        }
    }

    public static class Graphics{
        String name;
        Graphics(String name){
            this.name = name;
        }
    }

    public static class Storage{
        int size;
        Storage(int size){
            this.size = size;
        }
    }

    public static class Keyboard{
        String language;

        Keyboard(String language){
            this.language = language;
        }

    }
}
