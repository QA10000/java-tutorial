package abstractClass;

public class Dog extends Animal {

    public void sound() {
        System.out.println("baw");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();// how are abstract classes different from other classes?
    }
}
