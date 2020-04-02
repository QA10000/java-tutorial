package operators;

public class ComparisonOperators {

    public static void main(String[] args) {
        // we have six operators ==, !=, > < and >=, <=
        int num1 = 10;
        int num2 = 10;
        if(num1 < num2){
            System.out.println(num1 + " is less than " + num2); //                 System.out.println(a + " - " + b + " = " +(a - b));
        } else if(num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is greater than " + num2);
        }
        //System.out.println(num1);

    }
}
