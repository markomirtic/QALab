package CoreJava1;

public class ForLoop {

        public static void main(String[] args) {
            //For Loop
            //for(initialization; condition; increment/decrement)
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }

            //Itterate through the array
            int[] myArray = {10, 20, 30, 40, 50};
            //Call method lengt to get the length of the array.
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }

            // Single dimensional String array in For loop
            String[] myStringArray = {"Selenium", "Java", "TestNG", "Maven", "Jenkins"};
            for (int i = 0; i < myStringArray.length; i++) {
                System.out.println(myStringArray[i]);
            }

            //Multi dimensional array one line in For loop
            int[][] myArray2 = {{10, 20}, {30, 40}};
            for (int i = 0; i < myArray2.length; i++) {
                for (int j = 0; j < myArray2[i].length; j++) {
                    System.out.println(myArray2[i][j]);
                }

                //Enhanced For Loop
                //for(dataType variableName : arrayName)
                for (String myArray3 : myStringArray) {
                    System.out.println(myArray3);
                }

                //Conditional Statements in for loop
                for (int k = 0; k < 10; k++) {
                    if (k == 5) {
                        System.out.println("I am in if condition");
                    } else {
                        System.out.println("I am in else condition");
                    }


               int[] arr2 = {1,2,3,4,5,6,7,8,9,122};
                    //Print 2,4,6,8,10
                    for (int j = 0; j < arr2.length; j++) {
                        if (arr2[j] % 2 == 0) {
                            System.out.println(arr2[j]);
                            break;
                        }
                        else {
                            System.out.println(arr2[j]+ " This is odd number");
                        }
                    }



                }
            }


            }
        }
