package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("john");
        stringList.add("sam");
        stringList.add("mohan");
        stringList.add("sita");

        System.out.println(stringList.get(2));

        for(int i = 0; i < stringList.size(); i++ ) {
            System.out.println("Element at index " + i + " : " + stringList.get(i)); //"Element at index " + i + " : " + intArray2[i]);
        }
    }



}
