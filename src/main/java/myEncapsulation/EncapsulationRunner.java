package myEncapsulation;

public class EncapsulationRunner {

    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        encapsulationDemo.setEmpId(101);
        encapsulationDemo.setEmpName("John");
        encapsulationDemo.setEmpAge(34);
        System.out.println("The employee id is " + encapsulationDemo.getEmpId());
        System.out.println("The employee name is " + encapsulationDemo.getEmpName());
        System.out.println("The employee age is " + encapsulationDemo.getEmpAge());

        encapsulationDemo.setEmpId(102);
        encapsulationDemo.setEmpName("Mohan");
        encapsulationDemo.setEmpAge(37);
        System.out.println("The employee id is " + encapsulationDemo.getEmpId());
        System.out.println("The employee name is " + encapsulationDemo.getEmpName());
        System.out.println("The enmployee age is " + encapsulationDemo.getEmpAge());

        Person terry = new Person(103, "Terry", 40); // in real world we use second approch we are doing set empid and inside that we did get
        encapsulationDemo.setEmpId(terry.getPersonId()); //that was for creating object this one is for using set imp id and get person id
        encapsulationDemo.setEmpName(terry.getPersonName());
        encapsulationDemo.setEmpAge(terry.getPersonAge());
        System.out.println("The employee id is " + encapsulationDemo.getEmpId());
        System.out.println("The employee name is "+ encapsulationDemo.getEmpName());
        System.out.println("The employee age is " + encapsulationDemo.getEmpAge());// trying to understand the difference between what we did before and now

    }
}

