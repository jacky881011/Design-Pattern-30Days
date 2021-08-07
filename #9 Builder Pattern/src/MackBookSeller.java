
// Director

public class MackBookSeller {

    private MacbookProBuilder macbookProBuilder;

    MackBookSeller(MacbookProBuilder macbookProBuilder){
        this.macbookProBuilder = macbookProBuilder;
    }

    public MacbookPro lowSpec(){
        return macbookProBuilder.buildCPU(new MacbookPro.Processor("2.2GHz 6 核心第八代 Intel Core i7 處理器"))
                .buildMemory(new MacbookPro.Memory(16))
                .buildGraphics(new MacbookPro.Graphics("Radeon Pro 555X 配備 4GB GDDR5 記憶體"))
                .buildStorage(new MacbookPro.Storage(256))
                .buildKeyboard(new MacbookPro.Keyboard("中文注音")).build();
    }

    public MacbookPro HighSpec(){
        return macbookProBuilder.buildCPU(new MacbookPro.Processor("2.6GHz 6 核心第八代 Intel Core i7 處理器"))
                .buildMemory(new MacbookPro.Memory(16))
                .buildGraphics(new MacbookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
                .buildStorage(new MacbookPro.Storage(512))
                .buildKeyboard(new MacbookPro.Keyboard("中文注音")).build();
    }



}
