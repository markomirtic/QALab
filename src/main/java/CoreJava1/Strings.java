package CoreJava1;

public class Strings {
    public static void main(String[] args)
    {
        /*String is a collection of characters.
        There are 2 types of strings:
        1. String Literal
        2. String Object
        */

        //String Literal
        String myString = "Selenium";
        System.out.println(myString);

        //String Object - every time create a new object in memory
        String myString1 = new String("Selenium");
        String myString2 = new String("Selenium is a automation tool");
        myString2.split(" ");

       /* // Create string in array
        String[] splittedString = myString2.split("Selenium");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[2]);
        System.out.println(splittedString[3]);
        System.out.println(splittedString[4]);
        System.out.println(splittedString[2].trim());
*/
        //Printing the length of the string
        for(int i=0; i<myString2.length(); i++)
        {
            System.out.println(myString2.charAt(i));
        }

        //Printing the length of the string from the end
        for(int i=myString2.length()-1; i>=0; i--)
        {
            System.out.println(myString2.charAt(i));
        }
    }
}
