package constructors;

public class Employee {

    int empId;
    String empName;

    public Employee(int id, String name) {
        this.empId = id;
        this.empName = name;
    }

    public void info() {
        System.out.println("Id: " + empId + " Name: " + empName);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "John");
        Employee employee2 = new Employee(102, "Sandy");
        employee1.info();
        employee2.info();
    }

}
