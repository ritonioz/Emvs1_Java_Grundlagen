public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Use all of your knowledge for this tasks below. You are not restricted to certain loops anymore.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Calculate and print all the leap years from 0 to today's year.
        //
        //      A year is a leap year if it is divisible by 4.
        //      However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
        //
        //      Hint1: The divisibility by a particular number can be checked using the modulo operator.
        //
        //      Hint2: Check if your implementation is correct. For example; the Year 1900 is not a leap year.
        for (int year01 = 0;year01 < 2025; year01++){
            if (year01 % 4 == 0) {
                System.out.println(year01 + " Is a leap year");
            }
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Print out all numbers from 1-10.
        //      If a number is divisible by three, then print "Fizz".
        //      If a number is divisible by five, then print "Buzz".
        //      If a number is divisible by three and five, print "FizzBuzz".
        for (byte counter02 = 1; counter02 < 11; counter02++) {

            if (counter02 % 3 == 0 && counter02 % 5 ==0){
                System.out.println("FizzBuzz");
            }else if (counter02 % 3 == 0){
                System.out.println("Fizz");
            } else if (counter02 % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Nice number");
            }
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");  // Challenge!
        // 03.  Given a number n (n > 2 && n < 100), write a program which tells if n is a prime.
        //      Example: n = 7 -> "It's a prime number!"
        //      Example: n = 10 -> "It's not a prime number!"

        int n = 7; // change this value from prime to not prime to test
        // Your code here

        for (int number03 = 3; number03 > 2 && number03 < 101; number03++){
            if (number03 % 2 == 0){
                System.out.println(number03 + " is not a prime number!");
            } else if (number03 % 3 == 0){
                System.out.println(number03 + " is not a prime number!");
            } else if (number03 % 5 == 0) {
                System.out.println(number03 + " is not a prime number!");
                }else {
                System.out.println(number03 + " is a prime number!");
            }

            }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");  // Challenge+!
        // 04. Print all prime numbers from 2-100.

        // Sorry did in exercise03 because i did not make it with n
    }
}