import java.sql.SQLOutput;

public class Number {

    public void printOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public void dayOfWeek(int day) {
        String stringDay = "";
        if(day == 6 || day == 7) {
            stringDay = "Holiday";
        } else {
            if(day > 7 || day < 1) {
                System.out.println(day + " Not a valid date");
            } else{
                stringDay = "Working";
            }
        }
        switch (day) {
            case 1:
                System.out.println("Monday is a " + stringDay + " day");
                break;

            case 2:
                System.out.println("Tuesday is a " + stringDay + " day");
                break;

            case 3:
                System.out.println("Wednesday is a " + stringDay + " day");
                break;

            case 4:
                System.out.println("Thursday is a " + stringDay + " day");
                break;

            case 5:
                System.out.println("Friday is a " + stringDay + " day");
                break;
            case 6:
                System.out.println("Saturday is a " + stringDay);
                break;
            case 7:
                System.out.println("Sunday is a " + stringDay);
                break;
            default:
                System.out.println(day + " Not a valid date");
                break;
        }
    }

    public static void main(String[] args) {
        Number number = new Number();
        number.printOddEven(5);
        number.dayOfWeek(1);
    }
}

