package abstractClass;

public class ShapeRunner {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 6);
        System.out.println("Area of Rectangle is " + rectangle.area());
        Shape triangle = new Triangle( 6, 7 );
        System.out.println("Area of Triangle is " + triangle.area()); // why it shows v for object?
        Shape circle = new Circle(9);
        System.out.println("Area of Circle is " + circle.area());

    }
}
