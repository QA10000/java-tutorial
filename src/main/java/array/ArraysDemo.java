package array;

public class ArraysDemo {

   static int intArray3[] [] = new int[3][3];
   static String stringArray[] = new String[5];
    static int intArray2[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
       // System.out.println(intArray2.length);
       /* for(int i= 0; i < stringArray.length; i++) {
            stringArray[i]= "Element" + i; // so what should
        }

        for(int i = 0; i < stringArray.length; i++) {
            System.out.println("Element at index " + i + " : " +stringArray[i]);//
        }

        /*for(int i = 0; i < intArray2.length; i++) {
            System.out.println("Element at index " + i + " : " + intArray2[i]);
        }*/
       int arr[] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

       for(int i = 0; i < 3; i++) {
           for(int j = 0; j < 3; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
    }
}
