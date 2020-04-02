package loops;

public class MyForLoops {

    public void printNumbers() {
        for(int i=0; i<=10; i++){
            if(i % 2 == 0)
            System.out.println(i);
        }
    }

    public void printStars() {
        for(int i=1; i <= 5; i++) {
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printStarsReverse() {
        for (int i = 5; i>=1; i--) {
            for (int j = 5; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyForLoops myloops = new MyForLoops();
      //  myloops.printNumbers();
        //myloops.printStars();
        myloops.printStarsReverse();
    }
}
