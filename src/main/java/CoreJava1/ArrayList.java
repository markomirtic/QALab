package CoreJava1;
public class ArrayList {

    public static void main (String[]args)
    {
        /*Array List is a collection of similar data types.
        There are 2 types of array lists:
        1. Single Dimensional Array List
        2. Multi Dimensional Array List
        */

        //Single Dimensional Array List
        //Storing 5 values in the array list.
        java.util.ArrayList<Integer> myArrayList = new java.util.ArrayList<Integer>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        System.out.println(myArrayList.get(0));

        //Multi Dimensional Array List
        //Storing 2 values in the array list.
        java.util.ArrayList<java.util.ArrayList<Integer>> myArrayList1 = new java.util.ArrayList<java.util.ArrayList<Integer>>();
        java.util.ArrayList<Integer> myArrayList2 = new java.util.ArrayList<Integer>();
        myArrayList2.add(10);
        myArrayList2.add(20);
        java.util.ArrayList<Integer> myArrayList3 = new java.util.ArrayList<Integer>();
        myArrayList3.add(30);
        myArrayList3.add(40);
        myArrayList1.add(myArrayList2);
        myArrayList1.add(myArrayList3);
        System.out.println(myArrayList1.get(0).get(0));
    }

}
