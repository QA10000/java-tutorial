public class GarbageCollection {

    public static void main(String[] args) {
        Number number = new Number();
        number = null; // ok // what is null? null is  assume string , we assign String a = "", that will be a empty.
        // if we do a = null that means nothing. what is null pointer exception, this happens when we assign null but in later code
        // we forgot to assign value to that and we call that object then it will cause null pointer exception

        Number number2 = new Number();
        Number number3 = new Number();
        number2 = number3; // so number3 will go garbage collection
        System.gc();//yes

        GarbageCollection garbageCollection = new GarbageCollection();
        garbageCollection = null;
        GarbageCollection garbageCollection1 = new GarbageCollection();
        GarbageCollection garbageCollection2 = new GarbageCollection();
        garbageCollection1 = garbageCollection2;
        System.gc();

    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is performed by JVM");
    }
}
