public class Main {
    public static void main(String args[]){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redSquare = new RedShapeDecorator(new Square());

        System.out.println("Circle with normal border: ");
        circle.draw();

        System.out.println("\nCircle with red border: ");
        redCircle.draw();

        System.out.println("\nSquare with red border");
        redSquare.draw();

        Circle circle2 = new Circle();
        Square square2 = new Square();
        Shape redCircle2 = new RedShapeDecorator(circle2);
        Shape redSquare2 = new RedShapeDecorator(square2);

        redCircle2.draw();
        redSquare2.draw();

    }
}
