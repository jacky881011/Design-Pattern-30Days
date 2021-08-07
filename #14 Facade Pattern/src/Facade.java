import ComplexSystemClass.ClassOne;
import ComplexSystemClass.SubClassOne;
import ComplexSystemClass.SubClassThree;
import ComplexSystemClass.SubClassTwo;


public class Facade {
    private SubClassOne one;
    private SubClassTwo two;
    private SubClassThree three;
    private ClassOne four;

    public Facade(){
        one = new SubClassOne();
        two = new SubClassTwo();
        three = new SubClassThree();
        four = new ClassOne();
    }

    // 利用方法封裝其他複雜類別或系統之物件的方法
    public void MethodA(){
        one.MethodOne();
        four.MethodFour();
    }

    public void MethodB(){
        two.MethodTwo();
        three.MethodThree();
    }




}
