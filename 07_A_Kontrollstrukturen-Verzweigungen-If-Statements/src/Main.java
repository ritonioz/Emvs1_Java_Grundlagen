import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner UserInput = new Scanner(System.in);
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 1");
        // 01.  Check in an if-statement if the bigNumber is greater than the smallNumber.
        //      If the bigNumber is greater than the smallNumber, then print it so, that the following output is given:
        //      5000 is greater than 1!
        //      Don't type the number in the print-statement, use the variables

        int bigNumber = 5000;
        byte smallNumber = 1;

        // Your solution here:
        if (bigNumber > smallNumber){
            System.out.println("bigNumber is greater than smallNumber");
        }
        else {
            System.out.println("The bigNumber is not greater than the smallNumber");
        }


        // There are multiple ways to solve this problem.
        // One option would be to make the comparison directly in the if-statement.
        // Another option would be to make a variable, store the result in there and then check that variable in the
        // if-statement.
        // Implement the other one, which you haven't implemented above, here as well:

        // Your solution here:
        boolean result = bigNumber > smallNumber;

        if (result){
            System.out.println("bigNumber is greater than the smallNumber");
        }
        else {
            System.out.println("The bigNumber is not greater than the smallNumber");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 2");
        // 02.  Create a Scanner object named "userInputScanner". (Don't forget to import the scanner)
        byte speedLimit = 120;
        int drivingSpeed;



        System.out.println("How fast do you drive on the A9?");
        // Get the user input with the scanner and safe it in the variable drivingSpeed
        drivingSpeed = UserInput.nextInt();
        // Check if the drivingSpeed is greater than the value of the variable "speedlimit".
        // If so, print "You drove too fast!"
        if(speedLimit > drivingSpeed){
            System.out.println("You are not driving to fast");
        }
        else {
            System.out.println("You are driving to fast");
        }



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 3");
        // 03.  Write a program that prompts the user for a year.
        //      If the user input is smaller than 2000, then the program prints
        //      the string "Ancient history!"
        System.out.println("Give me a random year");
        int year = UserInput.nextInt();
        if (year >= 2000){
            System.out.println("You chose a modern year");
        }
        else {
            System.out.println("That is history");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 4");
        // 04.  Use the variables "speedLimit" and "drivingSpeed" from exercise 2.
        //      In this task, you need to enhance the speed-checking functionality.
        //      Ask the user again to input its driving speed.
        //      Print "You drove too fast!" if the "drivingSpeed" exceeds the "speedLimit."
        //      If the "drivingSpeed" is within the limit, print "You are all good!"
        System.out.println("How fast were you driving");
        int drivingSpeed2 = UserInput.nextInt() ;
        if(speedLimit > drivingSpeed2){
            System.out.println("You are all good");
        }
        else {
            System.out.println("You drove too fast");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 5");
        // 05.  Ask the user for his age.
        //      If he is older than 21, then let the user know that he is legally allowed to consume alcohol.
        //      If not, then tell the user that it is not legally allowed
        //      to consume alcohol everywhere in the world.
        System.out.println("How old are you?");
        byte older21 = UserInput.nextByte();
        if (older21 >= 21){
            System.out.println("You can legally drink alcohol in the USA");
        }
        else {
            System.out.println("You are not allowed to drink alcohol in the USA");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 6");
        // 06.  Now do the same as in exercise 5, but instead of only checking if the user is only 21,
        //      we also want to check if he is older than 18.
        System.out.println("Write your age again please!");
        byte older = UserInput.nextByte();
        //      If he is younger than 18, let the user know that he is not legally allowed to consume alcohol
        //      in most parts of the world,
        if (older >= 18){
            System.out.println("You are allowed to drink alcohol in the most parts of the world");
        } else if (older < 18) {
            System.out.println("You are not allowed to drink alcohol in the most countries of the world");
        }

        //      If however he is younger than 21, tell the user that he is legally allowed to consume alcohol
        //      in most parts of the world, except the United States,
        else if (older < 21) {
            System.out.println("You are not allowed to drink alcohol in the United States, but in the most parts of the world ");
        }
        //      However, if the user is older than 21, then tell him that he is allowed to consume alcohol
        //      everywhere.
        else {
            System.out.println("You can consume alcohol everywhere");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 7");
        // 07.  Ask the user for his age and IQ, and save those values in variables.
        //      If the user is younger than 20, then print out "You are still young".
        //      And if the user also has an IQ higher than 120, then print out this:
        //      " ...and also very smart!"
        System.out.println("How high is your IQ?");
        short iq = UserInput.nextShort();
        if (older < 20) {
            System.out.print("You are still young ");
           } else if (older >= 20 ) {
            System.out.println("You are not longer a teenager ");
        }
        if (iq >= 120) {
            System.out.println("and very smart!!!");
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 8");
        // 08.  Write a program that prompts the user for two integers and prints the larger of the two.
        //      If the numbers are the same, then the program informs us about this as well.
        //
        //      Sample output 1:
        //      Give the first number:
        //      7
        //      Give the second number:
        //      2
        //      Greater number is: 7
        //
        //
        //      Sample output 2:
        //      Give the first number:
        //      1
        //      Give the second number:
        //      9
        //      Greater number is: 9
        //
        //
        //      Sample output 3:
        //      Give the first number:
        //      3
        //      Give the second number:
        //      3
        //      The numbers are equal!
        System.out.println("Write down a number");
        int numberOne = UserInput.nextInt();
        System.out.println("Write down a second number");
        int numberTwo = UserInput.nextInt();

        if (numberOne > numberTwo) {
            System.out.println(numberOne + " is greater than " + numberTwo);
        } else if (numberOne < numberTwo ) {
            System.out.println(numberTwo + " is greater than " +numberOne );
        }
        else {
            System.out.println(numberOne + " equals " + numberTwo);
        }



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 9");
        // 09.  Write a program that give a course grade based on the values below:
        //      < 0       impossible
        //      0-30      failed
        //      31-50     poor
        //      51-60     ok
        //      61-80     good
        //      81-90     very good
        //      91-100    awesome!
        //      > 100     impossible
        System.out.println("How many points did you made in the exame?");
        byte examePoints = UserInput.nextByte();
        if (examePoints < 0) {
            System.out.println("impossible");
        }
            else if (examePoints < 30) {
            System.out.println("failed");
        }
            else if (examePoints < 50 ) {
            System.out.println("poor");
        }
            else if (examePoints < 60) {
            System.out.println("ok");
        }
            else if (examePoints < 80) {
            System.out.println("good");
        }
             else if (examePoints < 90 ) {
            System.out.println("very good");
        }
             else if (examePoints < 100) {
            System.out.println("awesome");
        }
             else {
            System.out.println("impossible");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 10");
        // 10.  Write a little program which checks the state of a door. If the door is open, print: "Entering room...".
        //      If the door is not open, print: "Opening door....".
        //      Write your solution with
        //      1. an if-else-statement and
        //      2. with its short form. (Don't forget: You can only return values with the short form)

        boolean isDoorOpen = true;
        // If-else-statement here
        if (isDoorOpen) {
            System.out.println("Entering room");
        }
        else {
            System.out.println("Opening door");
        }

        // Short form here
        String resultTwo = (isDoorOpen) ? "entering room" : "opening door" ;
        System.out.println(resultTwo);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 11");
        // 11.  There will be a huge festival coming up, and unfortunately, the prices are quite high.
        //      However, you will receive a discount if you are exactly 18 years old.
        //      Inform the user about the discount and ask for their age.
        //      If the user is exactly 18 years old, grant them the discount;
        //      otherwise, inform them that they are unfortunately not eligible for the discount.

        //      Create two solutions for this task: one that uses the "==" operator and another that uses the "!=" operator.
         System.out.println("How old are you, if you are exactly 18, you do not have to pay!");
        byte olderTwo = UserInput.nextByte() ;
        if (olderTwo == 18) {
            System.out.println("enjoy your visit, your ticket is for free!");
        }
        else if (olderTwo != 18){
            System.out.println("You have to pay for the ticket");
        }
        else {
            System.out.println("Code problem");
        }


    }
}

