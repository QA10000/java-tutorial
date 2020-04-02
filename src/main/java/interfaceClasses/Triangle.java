package interfaceClasses;

class Triangle implements ShapeInterface {

    @Override
    public double area(int w, int l) {
        return (w * l) / 2 ;
    }

    /*@Override
    public double areaOfCircle(int r) {
        return 0;
    }*/
}
