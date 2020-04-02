package interfaceClasses;

class Demo implements MyInterface {

    @Override
    public void myMethod1() {
        System.out.println( "Implementation of method1" );
    }

    @Override
    public void myMethod2() {
        System.out.println( "implementation of method2" );
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.myMethod1();
        demo.myMethod2();// 9am my time? that will be 7:30 eve ur time ol , thank you

    }

}
