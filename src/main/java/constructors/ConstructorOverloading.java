package constructors;

public class ConstructorOverloading {

    int empId;
    String empName;
    int empAge;

    public ConstructorOverloading() {
       empId = 100;
       empName = "Sam";
       empAge = 25;
    }

    public ConstructorOverloading(int id, String name, int age) {
      this.empId = id;
      this.empName = name;
      this.empAge = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int id) {
        this.empId = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String name) {
        this.empName = name;
    }

    public int getEmpAge() {
        return empAge;
    }
// we need getters and setters for set the value for class variables and return the values.
    public void setEmpAge(int age) {
        this.empAge = age;
    }

    public static void main(String[] args) {
        ConstructorOverloading constructorOverloading = new ConstructorOverloading();
        System.out.println(constructorOverloading.getEmpAge());
        ConstructorOverloading constructorOverloading1 = new ConstructorOverloading(200, "King", 34);
        System.out.println(constructorOverloading1.getEmpAge()); // no I was saying if we are going to do that or not


    }

}
