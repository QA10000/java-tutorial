package variables;

public class MyInstanceVariable {

    String myName = "King";

    public static void main(String[] args) {
        MyInstanceVariable myInstanceVariable1 = new MyInstanceVariable();
        MyInstanceVariable myInstanceVariable2 = new MyInstanceVariable();
        MyInstanceVariable myInstanceVariable3 = new MyInstanceVariable();

        System.out.println(myInstanceVariable1.myName);
        System.out.println(myInstanceVariable2.myName);
        System.out.println(myInstanceVariable3.myName);

        myInstanceVariable2.myName = "Jen"; // we cam change the value of a class varaible for one object , without affecting other instances of the class.

        System.out.println(myInstanceVariable1.myName);
        System.out.println(myInstanceVariable2.myName);
        System.out.println(myInstanceVariable3.myName);

    }


}
