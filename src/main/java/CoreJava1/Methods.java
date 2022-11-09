package CoreJava1;

public class Methods {
    public static void main(String[]args)
    {
        /*Methods are a collection of statements.
        There are 2 types of methods:
        1. Static Method
        2. Non-Static Method
        */
        Methods methods = new Methods();
        Methods1 methods1 = new Methods1();
        methods.myMethod();
        methods.myMethod1();
        methods1.myMethod1();
        myStaticMethod();

    }

    //Non-Static Method
    //Can access only non-static variables and methods.
    //void - does not return any value.
    public void myMethod()
    {
        System.out.println("This is my method");
    }

    //Methods with return type
    public String myMethod1()
    {
       String m = "This is String";
       System.out.println(m);
       return m;
    }

    //Static Method
    //Can access both static and non-static variables and methods.
    public static void myStaticMethod()
    {
        System.out.println("This is my static method");
    }

}
