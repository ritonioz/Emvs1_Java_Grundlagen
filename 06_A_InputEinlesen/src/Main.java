import java.nio.file.attribute.BasicFileAttributes;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
            Scanner userInput = new Scanner(System.in);
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
/*           System.out.println("Dear User, pleas write down your information, first name");
        String firstName = userInput.nextLine();
            System.out.println("last name");
        String lastName = userInput.nextLine();
            System.out.println("age");
        int age = userInput.nextInt();
        userInput.nextLine();
            System.out.println ("birthday");
        String birthDay = userInput.nextLine();
            System.out.println("birthmonth");
        String birthMonth = userInput.nextLine();
            System.out.println("birthyear");
        String birthYear = userInput.nextLine() ;
            System.out.println("job");
        String job = userInput.nextLine();
            System.out.println("gender");
        String gender = userInput.nextLine();
            System.out.println("hair color");
        String hairColor = userInput.nextLine();
            System.out.println("Do you like Fortnite? Answer with true or false");
        Boolean doYouLikeFortnite = userInput.nextBoolean();
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.

        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!
        System.out.println("Thanks for your information, " +firstName +" " +lastName);
        System.out.println("You are " +age +" years old and you were born in " +birthYear +" " +birthMonth +" " +birthDay);
        System.out.println("That means you are over " +"days old");

        // Calculation
        int ageInDays = age * 365;
        System.out.println("You approximately lived for over " +ageInDays +" days");

        System.out.println("You are a " +job +" and your gender is ");
        System.out.println("You have a fantastic hair color, it is " +hairColor);
        System.out.println("Do you like Fortnite?" +doYouLikeFortnite);
*/




        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication
/*        System.out.println("Write down a number between 1 and 100");
        float randomNumber1 = userInput.nextFloat();
        System.out.println("Write down a second number between 1 and 100");
        float randomNumber2 = userInput.nextFloat();

        System.out.println("addition "+ (randomNumber1 + randomNumber2));
        System.out.println("subtraction "+ (randomNumber1 - randomNumber2));
        System.out.println("multiplication "+ (randomNumber1 * randomNumber2));
        System.out.println("Division " + (randomNumber1 / randomNumber2));
*/
        //--------------------------------------------------------------------------------------------------------------
 /*       // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        System.out.println("How much do you weight in a full kg number?");
        short weight = userInput.nextShort();
        System.out.println("And how height are you in meter?");
        float height = userInput.nextFloat();
        double bmi = weight / (height * height);
        System.out.println("Your Bmi is " +bmi);
*/
        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
/*        System.out.println("Write down a number of minutes");
        int time = userInput.nextInt();
        int time1 = time / 60 ;
        int time2 = time % (60) ;
        System.out.println("That is " + time1 +" hours and " +time2 +" minutes"  );
*/
        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).
/*        System.out.println("Write down a radius for an operation");
        int radius = userInput.nextInt() ;
        double scope  = 2 * Math.PI * radius ;
        System.out.println("The scope uf your circle radius is " + scope);
        double area = Math.PI * radius * radius ;
        System.out.println("The area is as big as this number says it is, it is " +area);
*/
        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
/*        System.out.println("How much is the bill?");
        int bill = userInput.nextInt();
        System.out.println("How much will you give as a tip in a percentage without the %");
        int  tipPrecentage = userInput.nextInt();
        int totalBill = bill * tipPrecentage /100 +bill;
        System.out.println("It is a total of " + totalBill);
*/
        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
/*        System.out.println("What do is your wage per hour?");
        int wagePerHours = userInput.nextInt();
        System.out.println("How many hours do you work a week?");
        int weeklyHours = userInput.nextInt();
        int salaryPerMonth = wagePerHours * weeklyHours * 4 ;
        int salaryPerYear = salaryPerMonth * 13;
        System.out.println("Your monthly salary is " +salaryPerMonth);
        System.out.println("Your yearly salary is " +salaryPerYear);
*/
        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!
        System.out.println("Hello, Hello, let's play a little quiz, if your answer is correct write 1, if you are false, write 0");
        System.out.println("If you understand the rules of the game, write “OK”; otherwise, look for a homeless shelter.");
        int counter = 0 ;
        String answer = userInput.nextLine();
        System.out.println("Let the quiz begin, what are my favorite hobbies (2 hobbies)");
        answer = userInput.nextLine();
        System.out.println("The correct answer is playing the drums and floorball");
        System.out.println("Write 1 if you were correct, write 0 if you were wrong");
        int answer1 = userInput.nextInt();
        counter = counter + answer1;
        System.out.println("Your current score is " +counter);
        System.out.println("Next question, where do I go to the school?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("The correct answer is in Visp");
        System.out.println("Write 1 if you were correct, write 0 if you were wrong");
        int answer2 = userInput.nextInt();
        System.out.println("Your current score is " +counter);
        System.out.println("Last question, what is 1+1 according to me?");
        userInput.nextLine();
        answer = userInput.nextLine();
        System.out.println("The correct answer is 3");
        System.out.println("Write 1 if you were correct, write 0 if you were wrong");
        answer = userInput.nextLine();
        System.out.println("Your final score is " +counter);
        System.out.println("Congratulation");

        userInput.close();

        // Make sure you didn't forget to close the scanner :)
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);