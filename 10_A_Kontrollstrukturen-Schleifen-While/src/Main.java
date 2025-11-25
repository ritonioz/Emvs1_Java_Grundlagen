import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //     while (iteratorEx1 < 10) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //     }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is? It would show always 0 for a long time
        //      2. Why does this behavior occur?  because it repeat itself until it is finished but because you do not count +1 it will not happen
        //      3. How can you modify the code to achieve the desired output:      at the end of the loop iteratorEx1++
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)
        byte counter02_01 = 0;
        while (counter02_01 < 100){
            counter02_01++;
            System.out.println(counter02_01);
            }
        byte counter02_02 = 42;
        while (counter02_02 < 100 ){
            counter02_02++;
            System.out.println(counter02_02);
        }
        byte counter02_03 = 42;
        while (counter02_03 < 123){
            counter02_03++;
            System.out.println(counter02_03);
        };
        byte counter02_04 = 0;
        while (counter02_04 < 10){
            counter02_04 += 2 ;
            System.out.println(counter02_04);
        };
        byte counter02_05 = -1;
        while (counter02_05 < 10){
            counter02_05 += 2;
            System.out.println(counter02_05);
        };
        byte counter02_06 = -10;
        while (counter02_06 < 20){
            counter02_06++;
            System.out.println(counter02_06);
        };
        byte counter02_07 = 35;
        while (counter02_07 > 0){
            counter02_07--;
            System.out.println(counter02_07);
        };
        byte counter02_08 = 15;
        while (counter02_08 > -20){
            counter02_08--;
            System.out.println(counter02_08);
        };
        byte counter02_09 = 10;
        while (counter02_09 > -10){
            counter02_09 -=2;
            System.out.println(counter02_09);
        };
        byte counter02_10 = 9;
        while (counter02_10 > -10){
            counter02_10 -=2;
            System.out.println(counter02_10);
        }



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.
        byte number03 = 0;
        int whileSum_03 = 0;

        // Your code here
        while (number03 <= 100){
            whileSum_03 += number03;
            number03++;
        }

        System.out.println(whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.
        byte number04 = 0;
        int whileSum_04 = 0;


        // Your code here

        while (number04 <= 100) {
            whileSum_04 += number04;
            number04 += 2;
        }

        System.out.println(whileSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.
        byte number05 = 1;
        int whileSum_05 = 0;

        // Your code here

        while (number05 <= 100) {
            whileSum_05 += number05;
            number05 += 2;
        }

        System.out.println(whileSum_05); // Should be 2500

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber = 0;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)

        int trys = 0;

        while (randomNumber != 22) {
            randomNumber = randomGenerator.nextInt(101);
            trys++;
        }
        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here

        System.out.println("The program ran " + trys + " times until the number 22 was found!");
    }
}