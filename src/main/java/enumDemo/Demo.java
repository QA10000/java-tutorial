package enumDemo;

import static enumDemo.Direction.*;

public class Demo {

    public static void main(String[] args) {
       // Direction direction = Direction.SOUTH;
        //System.out.println(direction.toString());
        getMyDirection(NORTH);
    }

    public static void getMyDirection(Direction direction) {
        switch(direction) {
            case EAST:  // so what is this unqualified name
                System.out.println("East direction");
                break;
            case WEST: // so it is complaining about type of variable
                System.out.println("West direction");
                break;
            case SOUTH:
                System.out.println("South direction");
                break;
            case NORTH:
                System.out.println("North direction");
                break;
            default:
                System.out.println("Invalid direction");
                break;
        }

    } // not yet
}
