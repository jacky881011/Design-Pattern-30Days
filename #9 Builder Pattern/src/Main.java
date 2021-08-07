public class Main {
    public static void main(String args[]){
        MacbookPro_2018 macbookPro_2018 = new MacbookPro_2018();
        MackBookSeller mackBookSeller = new MackBookSeller(macbookPro_2018);  // 因為MacbookPro_2018有繼承了該MacbookProBuilder所以說就等同於他

        // 經銷商的固定規格
        MacbookPro macbookProHighSpec = mackBookSeller.HighSpec();
        System.out.println("\n");
        System.out.println("---------------高配置版本---------------\n");
        System.out.println(macbookProHighSpec.toString());

        MacbookPro macbookProLowSpec = mackBookSeller.lowSpec();
        System.out.println("\n");
        System.out.println("---------------低配置版本----------------\n");
        System.out.println(macbookProLowSpec.toString());

        // 自行訂製的方式
        System.out.println("\n");
        System.out.println("---------------自定義配置版本----------------\n");
        MacbookPro dreamBook = macbookPro_2018.buildCPU(new MacbookPro.Processor("2.9GHz 6 核心第八代 Intel Core i9 處理器"))
                .buildMemory(new MacbookPro.Memory(32))
                .buildGraphics(new MacbookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
                .buildStorage(new MacbookPro.Storage(4096))
                .buildKeyboard(new MacbookPro.Keyboard("英文")).build();

        System.out.println(dreamBook.toString());

    }
}
