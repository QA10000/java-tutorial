package interfaceClasses;

import javax.jws.Oneway;

class Rectangle implements ShapeInterface {

    @Override
    public double area(int w, int l) {
        return w * l;
    }

   /* @Override
    public double areaOfCircle(int r) {
        return 0;
    } */
}