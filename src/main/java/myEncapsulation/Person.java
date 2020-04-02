package myEncapsulation;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getPersonId(){ // all getters and setters are public
        return id;
    }

    public String getPersonName() {
        return name;
    }

    public int getPersonAge() {
        return age;
    }
}
