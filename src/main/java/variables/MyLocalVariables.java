package variables;

public class MyLocalVariables {

    public void printMyName() {
        String myName = "Wendy";
        System.out.println(myName);
    }

    public static void main(String[] args) {
        MyLocalVariables myLocalVariables = new MyLocalVariables();
        myLocalVariables.printMyName();
    }
}
