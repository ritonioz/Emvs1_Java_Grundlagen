public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with for-loops
        // Exercise 01-05 are similar to the while-exercises, just with a for instead of a while-loop.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      for (int iteratorEx1 = 0; iteratorEx1 < 10; ) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      2. Why does this behavior occur?
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9

        // it would say 0 always, because the 3 thing isn't there, it is < 9

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using for loops, print each task and its numbers to the console (all numbers inclusive):
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

        for (byte counter0201= 0; counter0201 < 101; counter0201++) {
            System.out.println(counter0201);
        }
        for (byte counter0202= 42; counter0202 < 101; counter0202++) {
            System.out.println(counter0202);
        }
        for (byte counter0203= 42; counter0203 < 124; counter0203++) {
            System.out.println(counter0203);
        }
        for (byte counter0204= 0; counter0204< 11; counter0204 += 2) {
            System.out.println(counter0204);
        }
        for (byte counter0205 = 1; counter0205 < 11; counter0205 += 2) {
            System.out.println(counter0205);
        }
        for (byte counter0206 = -10; counter0206 < 20; counter0206++) {
            System.out.println(counter0206);
        }
        for (byte counter0207 = 35; counter0207 > -1; counter0207-= 1) {
            System.out.println(counter0207);
        }
        for (byte counter0208 = 15; counter0208 > -20; counter0208-= 1) {
            System.out.println(counter0208);
        }
        for (byte counter0209 = 10; counter0209 > -10; counter0209-= 2) {
            System.out.println(counter0209);
        }
        for (byte counter0210= 9; counter0210 > -10; counter0210-= 2) {
            System.out.println(counter0210);
        }



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_03 = 0;

        // Your code here
        for (byte number03 = 0; number03 < 101; number03++) {
            forSum_03 += number03;
        }


        System.out.println(forSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_04 = 0;


        // Your code here
        for (byte number04 = 0; number04 < 101; number04+= 2) {
            forSum_04 += number04;
        }

        System.out.println(forSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_05 = 0;



        // Your code here
        for (byte number05 = 1; number05 < 101; number05 += 2) {
            forSum_05 += number05;
        }

        System.out.println(forSum_05); // Should be 2500

    }
}