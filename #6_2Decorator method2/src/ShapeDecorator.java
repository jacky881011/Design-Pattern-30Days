public abstract class ShapeDecorator implements  Shape{
    protected Shape decoratedShape;        // 動態地將責任加諸於物件上

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }


}
