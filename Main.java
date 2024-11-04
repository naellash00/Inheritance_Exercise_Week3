//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // (1). Tes Shape:
        Shape shape1 = new Shape();
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        System.out.println(shape1.toString());

        Shape shape2 = new Shape("pink", false);
        System.out.println(shape2.toString());
        shape2.setFilled(true);
        System.out.println(shape2.toString());

        System.out.println("****************************************");

        // (2). Test Circle:
        Circle circle1 = new Circle();
        //System.out.println(circle1.toString());
        System.out.println("Initial Radius: " + circle1.getRadius());
        circle1.setRadius(2.4);
        System.out.println("After setting new radius: " + circle1.getRadius());

        Circle circle2 = new Circle(5.6);
        System.out.println("Area of Circle2: " + circle2.getArea());
        System.out.println("Perimeter of Circle2: " + circle2.getPerimeter());

        Circle circle3 = new Circle("yellow", true, 9.8);
        System.out.println(circle3.toString());

        System.out.println("****************************************");

        // (3). Test Rectangle:
        System.out.println("Rectangle1: ");
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Initial Width: " + rectangle1.getWidth());
        System.out.println("Initial Length: " + rectangle1.getLength());
        rectangle1.setLength(10);
        rectangle1.setWidth(5);
        System.out.println("After changing width and length: ");
        System.out.println(rectangle1.toString());

        System.out.println("Rectangle2: ");
        Rectangle rectangle2 = new Rectangle(3, 9);
        System.out.println(rectangle2.toString());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        System.out.println("Rectangle3: ");
        Rectangle rectangle3 = new Rectangle(7, 15, "red", false);
        System.out.println(rectangle3.toString());

        System.out.println("****************************************");

        // (4). Test Square:
        System.out.println("Square1: ");
        Square square1 = new Square();
        square1.setSide(5);
        System.out.println(square1.getSide());
        System.out.println(square1.toString());

        System.out.println("Square2: ");
        Square square2 = new Square(8.8);
        System.out.println(square2.toString());

        System.out.println("Square3: ");
        Square square3 = new Square(3, "blue", true);
        System.out.println(square3.toString());
        System.out.println("Area: " + square3.getArea() + "\n Perimeter: " + square3.getPerimeter());



    }
}