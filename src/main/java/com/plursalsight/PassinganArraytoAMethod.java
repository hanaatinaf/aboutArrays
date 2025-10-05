package com.plursalsight;
import java.util.Scanner;
/*Passing arrays: When you want a method to process YOUR data (calculate average,
find high score, etc.)
Returning arrays: When you want a method to GIVE YOU data (get test scores from user,
generate random numbers, etc.)*/

public class PassinganArraytoAMethod {
    public static void main(String[] args) {
        //numbers - Passing Array to a Method
        //We create an array called numbers with 7 values
        //We pass this entire array to the displayarrayNum method
        int[] numbers = {19,45,66,66,90,636,22};
        displayarrayNum(numbers);
        //System.out.println(numbers);

        //n - Returning Array from a Method
        // We call returnArrayfromMethods() which gives us back an array
        // We store that returned array in a new variable n
        // Then we loop through n to display its contents
        int[] n = returnArrayfromMethods();
        for (int i = 0; i<n.length; i++){
            System.out.println("The indext num:" + i + "The value:" + n[i]);
        }


        String[] names = nameOfThePeople();
        /*for (String name : names){
            System.out.println(name);
        }*/
        for (int i = 0; i<names.length; i++){
            System.out.println("The indext num:" + i + "The value:" + names[i]);
        }

    }
    public  static  void displayarrayNum(int[] num){
        for (int i = 0; i<num.length ; i++){
            System.out.println("the index num is:" + i + " The value is:"+ num[i]);
        }
   /*The method receives the array as num (you can use any parameter name)
   It loops through and prints both the index(i) AND the value(num[i])
   Important: The method doesn't return anything (void) - it just does work and finishes*/

    }
    /*Returning an Array from a Method*/
    public  static int[] returnArrayfromMethods(){
        int[] numbers = {3,4,55,33,22,21,5554,77};
        return  numbers;

        /*Notice the return type is int[] (array of integers)
        The method creates an array, then returns it*/

    }
    // this method will return an String array of num;
    public static  String[] nameOfThePeople(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre the how many  name you want store:");
        int names1 = scanner.nextInt();

        scanner.nextLine();// clear the buffer

        String[] name=  new String[names1];

         for (int i = 0; i <name.length; i++){
            System.out.println("The index: " + i + "The Name" + (i+ 1)+ ":");
            name[i] = scanner.nextLine();// stores the name
            // name.toString();
        }
         scanner.close();
         return name;
    }
}
