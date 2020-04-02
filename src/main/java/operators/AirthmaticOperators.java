package operators;

public class AirthmaticOperators {

    public void myCalculation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                 System.out.println(a + " + " + b + " = " +(a + b));
                 break;
            case "*":
                System.out.println(a + " * " + b + " = " +(a * b));
                break;
            case "/":
                System.out.println(a + " / " + b + " = " +(a / b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " +(a - b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 20;
        System.out.println("Number1 + Number2 = " + (number1 + number2));
        System.out.println("Number1 - Number2 = " + (number1 - number2));
        System.out.println("Number1 * Number2 = " + (number1 * number2));
        System.out.println("Number1 / Number2 = " + (number1 / number2));
        System.out.println("Mod of Number1 and Number2 = " + (number1 % number2));
        AirthmaticOperators airthmaticOperators = new AirthmaticOperators();
        airthmaticOperators.myCalculation(5, 7, "-");
    }
}
