package abstractClass;

public class Triangle extends Shape {

    int a;
    int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return (a * b) / 2 ;
    }

}
