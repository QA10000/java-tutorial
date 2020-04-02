package interfaceClasses;

public class ShapeRunner {

    public static void main (String[] Args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        System.out.println("Area of Rectangle is " + rectangle.area(5, 6));
        System.out.println("Area of Triangle is " + triangle.area(7, 9 ));
        System.out.println("Area of Circle is " + circle.areaOfCircle(6)); // yes
    }
}
