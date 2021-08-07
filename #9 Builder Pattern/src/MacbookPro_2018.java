import javax.crypto.Mac;

// 實際的builder

public class MacbookPro_2018 extends MacbookProBuilder{
    @Override
    MacbookPro build(){
        return super.build();
    }

    MacbookPro_2018(){
        super();            // super  macbookPro = new MacbookPro();
    }

    // need to override the MacbookProBuilder method
    @Override
    MacbookProBuilder buildCPU(MacbookPro.Processor processor){
        this.macbookPro.setProcessor(processor);
        return this;
    }

    @Override
    MacbookProBuilder buildMemory(MacbookPro.Memory memory){
        this.macbookPro.setMemory(memory);
        return this;
    }

    @Override
    MacbookProBuilder buildGraphics(MacbookPro.Graphics graphics){
        this.macbookPro.setGraphics(graphics);
        return this;
    }

    @Override
    MacbookProBuilder buildStorage(MacbookPro.Storage storage){
        this.macbookPro.setStorage(storage);
        return this;
    }

    @Override
    MacbookProBuilder buildKeyboard(MacbookPro.Keyboard keyboard){
        this.macbookPro.setKeyboard(keyboard);
        return this;
    }



}
