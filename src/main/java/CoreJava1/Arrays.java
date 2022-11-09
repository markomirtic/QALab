package CoreJava1;

public class Arrays {

    public static void main (String[]args)
    {
        /*Array is a collection of similar data types.
        There are 2 types of arrays:
        1. Single Dimensional Array
        2. Multi Dimensional Array
        */

        //Single Dimensional Array
        //Storing 5 values in the array.
        int[] myArray = new int[5];
        //Arrays start with index 0.
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;
        System.out.println(myArray[0]);

        //Arrays in one line
        int[] myArray1 = {10,20,30,40,50};
        System.out.println(myArray1[0]);

        //Multi Dimensional Array
        //Storing 2 values in the array.
        int[][] myArray2 = new int[2][2];
        myArray2[0][0] = 10;
        myArray2[0][1] = 20;
        myArray2[1][0] = 30;
        myArray2[1][1] = 40;
        System.out.println(myArray2[0][0]);
    }

}
