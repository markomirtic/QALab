package CoreJava;

public class VariablesAndDataTypes {

    /*
    Variables are used to store data in the memory.
    There are 2 types of variables:
    1. Local Variables
    2. Global Variables

    Local Variables:
    Local variables are declared inside the methods.
    Local variables are not accessible outside the methods.
    Local variables are not accessible inside the static methods.
    Local variables are not accessible inside the static blocks.
    Local variables are not accessible inside the static classes.

    Global Variables:
    Global variables are declared outside the methods.
    Global variables are accessible inside the methods.
    Global variables are accessible inside the static methods.
    Global variables are accessible inside the static blocks.
    Global variables are accessible inside the static classes.

    Data Types:
    There are 2 types of data types:
    1. Primitive Data Types
    2. Non-Primitive Data Types

    Primitive Data Types:
    There are 8 primitive data types:
    1. byte
    2. short
    3. int
    4. long
    5. float
    6. double
    7. boolean
    8. char

    Non-Primitive Data Types:
    There are 2 non-primitive data types:
    1. String
    2. Array
    */
    // Main method is the starting point of the execution.
    public static void main(String[] args) {

    int MyNumber = 10;
    String myName = "Selenium";
    char myChar = 'S';
    boolean myBoolean = true;
    double myDouble = 10.5;
    float myFloat = 10.5f;

    //Print the values of the variables.
    System.out.println(MyNumber);
    System.out.println(myName);
    System.out.println(myChar);
    System.out.println(myBoolean);
    System.out.println(myDouble);
    System.out.println(myFloat);

    //Print all the values in one line.
    System.out.println(MyNumber + " " + myName + " " + myChar + " " + myBoolean + " " + myDouble + " " + myFloat);


    }



}
