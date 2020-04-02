package abstractClass;

public class Rectangle extends Shape {
    int w;
    int l;

    public Rectangle(int w, int l) {
        this.w = w;
        this.l = l;
    }

    public double area() {
        return w * l;
    }

}

