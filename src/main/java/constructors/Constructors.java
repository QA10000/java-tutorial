package constructors;

public class Constructors {

    // constructor is a block of code, which is initialized first when you call from object,we will use class name as constructor name
    // it will not have return type.
    String name;
// default, parametrized, none arguments constructor(no arg),default one are which  are created at run time
   public Constructors(){
       System.out.println("no arg constructor");
       this.name = "jen";  // default constructor is without access modifier, we can do constructor overloading
   }// class can have only one constructor

   public static void main(String[] args) {
       Constructors constructors = new Constructors();
       System.out.println(constructors.name);
   }
}
