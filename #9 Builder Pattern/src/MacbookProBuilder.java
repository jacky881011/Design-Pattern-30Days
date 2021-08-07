import javax.crypto.Mac;

// MacbookBuilder介面類別 <<abstract>> Builder

public abstract class MacbookProBuilder {
    protected MacbookPro macbookPro;

    MacbookProBuilder(){
        macbookPro = new MacbookPro();
    }

    abstract MacbookProBuilder buildCPU(MacbookPro.Processor processor);

    abstract MacbookProBuilder buildMemory(MacbookPro.Memory memory);

    abstract MacbookProBuilder buildGraphics(MacbookPro.Graphics graphics);

    abstract MacbookProBuilder buildStorage(MacbookPro.Storage storage);

    abstract MacbookProBuilder buildKeyboard(MacbookPro.Keyboard keyboard);

    MacbookPro build(){     //回傳物件的方式
        return macbookPro;
    }

}
