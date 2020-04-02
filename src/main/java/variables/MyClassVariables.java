package variables;

public class MyClassVariables {
    //class variables also called static variables
    // no white spaces, we can use _ .example is total_money
    // special variable allowed , variable name should start with lowercase
    // variable names are case senstive myname and Myname are two different variables
    // be careful about curlybraces, you need to know the scope
    // static variable can be use only in static method and we don't need to create  object to use them
    static String myName = "tim";

    public static void main(String[] args) {
        MyClassVariables myClassVariables1 = new MyClassVariables();
        MyClassVariables myClassVariables2 = new MyClassVariables();
        MyClassVariables myClassVariables3 = new MyClassVariables();

        System.out.println(myClassVariables1.myName);
        System.out.println(myClassVariables2.myName);
        System.out.println(myClassVariables3.myName);

       myClassVariables1.myName = "Tim";// static variable we can't change the value for one object

        System.out.println(myClassVariables1.myName);
        System.out.println(myClassVariables2.myName);
        System.out.println(myClassVariables3.myName);



    }
}