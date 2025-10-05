package com.plursalsight;
import  java.util.Scanner;

/*Definition: An array is a list of elements (like numbers, text, etc.) all of the same type.

Key Point: The size of the array is fixed when you create it. You can't make it bigger or smaller later.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hell");
        // create and initialize at the same time
        // this array holdes integers in this case
        int[] scores = {77,80,99,90,65};
        // create a empty array  this holdes 4 string
        //This creates an array that can hold 4  Strings.
        //All slots are initially `null` (which means "no value").
        String[] name = new String[4];
        System.out.println(name);
        System.out.println("Entre the 10 num:");
        //int[] n = scanner.nextInt();

       // System.out.println(n);

        //How to Access Elements in an Array
        // we use index num and indexs start at 0
        int atindext = scores[0];
        System.out.println(atindext);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        //To get the total number of elements (the length), you use .length.
        int a =  name.length;
        System.out.println(a);

        int b =  scores.length;
        System.out.println("the total num of elemnt we have here is :"+ b);

        // How to Loop Through an Array
        //The Standard for Loop (You have the index)
        //This is very powerful because you know the position (index) of each element.
        for (int i = 0; i < scores.length; i++){
            System.out.println("The index of " + i + " has value " + scores[i]);

        }
        //int i = 0;: Start at the first index (0).
        //i < scores.length;: Keep going as long as i is less than the length (so, from 0 to 5)
        // i++: Increase i by 1 each time.

       // The "for-each" Loop (You have the value)
       // This is simpler if you only care about the values, not their positions.
        for (int singlen: scores){
            System.out.println(singlen);
        }

        /*When you use the for statement to loop through an array, you have access to the index and can use that to access the
element of an array
When you use the for-each statement to loop through an array, you have the element in the array*/




    }
}