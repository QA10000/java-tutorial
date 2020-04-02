package string;

public class StringDemo {

    String str1 = "something";
    String str2 = "something";
    String str3 = new String( "something" );
    String str4 = new String( "somthing" );

    public void checkPalindrome(String master) {
        int length = master.length();
        String strReverse = "";
        for (int i = length - 1; i >= 0; i--) {
            strReverse = strReverse + master.charAt( i );
        }
        if (strReverse.equals( master )) {
            System.out.println( "\"" + master + "\"" + " is a palindrome!" );
        } else {
            System.out.println( "\"" + master + "\"" + " is  not a palindrome!" );
        }
    }

    public void checkOccurrence(String word, String letter) {
        int occurrences = 0;
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf( word.charAt( i ) ).equals( letter )) {// what should I paste no
                occurrences = occurrences + 1;
            }
        }
        System.out.println( "Char '" + letter + "' occurred " + occurrences + " times in the \"" + word + "\"" ); // so int i is inside the for loop
    }

    public static void main(String[] args) {
        String str = "Welcome to string class"; // sorry
        char chr1 = str.charAt( 0 );
        // char chr2 = str.charAt(-1);
        //  System.out.println(chr2);// so you should create a method accepts a string , put it as parameter, pub void checkp
        // have some logic and check if it is palindrome // ok
        StringDemo stringDemo = new StringDemo();
        stringDemo.checkPalindrome( "wow" );
        stringDemo.checkOccurrence( "cool", "O" );
        String str6 = "welcome to java";
        String str7 = "APPLE";
        System.out.println(str6.substring(2, 12));//ok
        System.out.println(str6.concat(" "+str7));
        System.out.println(str7.replaceFirst("P", "X" ));
        System.out.println(str.contains("java"));// yes


        String array[] = str.split("to");
        System.out.println(array[1]); // tryint to understandy why it printed just welcome first time and now string class ok
        String str8 = "     welcome to java     ";
        System.out.println(str8.trim());
    }
}

