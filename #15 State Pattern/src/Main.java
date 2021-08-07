public class Main {
    public static  void main(String args[]){
        State state1 = new MetricState1();
        State state2 = new BritishState2();

        MetricSystem metricSystem = new MetricSystem();

        System.out.println("---------------公制:---------------");
        metricSystem.setState(state1);
        metricSystem.tempView(50d);
        metricSystem.vibView(10d);
        metricSystem.tempSave(50d);
        metricSystem.vibSave(10d);

        System.out.println("\n");

        System.out.println("---------------英制:---------------");
        metricSystem.setState(state2);
        metricSystem.tempView(50d);
        metricSystem.vibView(10d);
        metricSystem.tempSave(50d);
        metricSystem.vibSave(10d);


    }
}
