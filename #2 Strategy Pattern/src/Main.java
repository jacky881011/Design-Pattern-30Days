import java.util.Calendar;

public class Main {
    public static void main(String args[]){
        Calculator cal1 = new Calculator();
        Calculator divide1 = new Calculator();


        cal1.setStrategy(Dotype.ADD);
        int ans1 = cal1.execute(4,5);
        System.out.println("ADD");
        System.out.println(ans1);

        cal1.setStrategy(Dotype.DIVIDE);
        double ans2 = cal1.execute(10,4);
        System.out.println("DIVIDE");
        System.out.println(ans2);

        cal1.setStrategy(Dotype.MINUS);
        int ans3 = cal1.execute(9,4);
        System.out.println("MINUS");
        System.out.println(ans3);






        BusStrategy bus1 =new BusStrategy();
        MRTStrategy mrt1 = new MRTStrategy();
        PriceCaculator pc1 = new PriceCaculator(bus1);
        PriceCaculator pc2 = new PriceCaculator(mrt1);

        //pc2.setStrategy2(mrt1);
        System.out.println(pc2.calculate(20));


        //pc1.setStrategy2(bus1);
        System.out.println(pc1.calculate(9));






    }

     public static class add implements IStrategy{
        @Override
        public int caculate(int a ,int b){
            return a + b ;
        }
    }

    public static class minus implements IStrategy{
        @Override
        public int caculate(int a ,int b){
            return a - b ;
        }
    }

    public static class divide implements IStrategy{
        @Override
        public int caculate(int a ,int b){
            return a / b ;
        }
    }

    public static class multiply implements IStrategy{
        @Override
        public int caculate(int a ,int b){
            return a * b ;
        }
    }

    //利用光場模式去將所有演算法進行封裝
     public static class Calculator{
        private int now = 0;
        private IStrategy strategy ;

        //策略模式
        public int execute(int a, int b){
            now = strategy.caculate(a,b);
            return  now;
        }
        public void reset(){
            this.now = 0;
        }
        //工廠模式
        public void setStrategy(Dotype doType){
            switch(doType){
                case ADD:
                    this.strategy = new add();
                    break;

                case MINUS:
                    this.strategy = new minus();
                    break;

                case MULTIPLY:
                    this.strategy = new multiply();
                    break;

                case DIVIDE:
                    this.strategy = new divide();
                    break;
            }
        }

    }
    enum Dotype{
        ADD , MINUS ,DIVIDE , MULTIPLY
    }
}
