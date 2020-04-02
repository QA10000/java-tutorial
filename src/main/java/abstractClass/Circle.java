package abstractClass;

public class Circle extends Shape {

    int a;

    public Circle(int a) {
        this.a = a;
    }

    public double area() {
        return a * a * Math.PI;//ok includes implementation also , it is called concrete method
    }
}
