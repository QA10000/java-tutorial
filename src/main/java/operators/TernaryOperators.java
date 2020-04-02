package operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class TernaryOperators {

    public static void main(String[] args) {
        int num1, num2;
        num1 = 10;
        num2 = (num1 == 10) ? 100 : 200;// this is another way of writing if statemnemt, has limitation , can be usedonly for assigning the value
        System.out.println(num2);

        int a = 50;
        int b = 20;
        int c = 30;
        int largest = 0;
        largest = (a > b) ? a : b;
        int result = (c > largest) ? c : largest;

        System.out.println("The largest number is " + result);
    }
}
