 class OuterClass {

    private int x = 1;

    public void innerInstance() {
        InnerClass innerClass = new InnerClass();
        innerClass.outerInstance();
    }

    public static void main(String[] args) {
        OuterClass object = new OuterClass();
        object.innerInstance();
    }

    class InnerClass {

        public void outerInstance() {
            System.out.println("Outer value of x is " + x);
        }
    }
}
