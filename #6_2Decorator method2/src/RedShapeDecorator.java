public class RedShapeDecorator extends  ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape){
        super(decoratorShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }


    public void setRedBorder(Shape decoratorShape){
        System.out.println("Border Color: red");
    }


}



