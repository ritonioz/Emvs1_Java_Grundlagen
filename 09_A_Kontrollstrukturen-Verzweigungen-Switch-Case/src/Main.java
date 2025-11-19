import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.
        System.out.println("Write down a number between 1 and 7");
        byte day = UserInput.nextByte();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No number between 1-7");
                break;
        }
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("No number between 1-7");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.
        UserInput.nextLine();
        System.out.println("Write down a month");
        String month = UserInput.nextLine() ;

        switch (month) {
            case "December", "January", "February":
                System.out.println("Winter");
            break;
            case "March", "April", "May":
                System.out.println("Spring");
            break;
            case "June", "July", "August":
                System.out.println("Summer");
            break;
            case "September", "October", "November":
                System.out.println("Autumn");
            break;
            default:
                System.out.println("No month typed in");
                break;
        }
        switch (month){
            case "December", "January", "February" -> System.out.println("Winter");
            case "March", "April", "May" -> System.out.println("Spring");
            case "June", "July", "August" -> System.out.println("Summer");
            case "September", "October", "November" -> System.out.println("Autumn");
            default -> System.out.println("No month typed in");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
        System.out.println("Write down a number between 1-12");
        byte month1 = UserInput.nextByte();

        switch (month1) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("The month has 31 days");
            break;
            case 2:
                System.out.println("The month has 28 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("The Month has 30 days");
            break;
            default:
                System.out.println("No number between 1-12 typed in");
        }

        switch (month1) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("The month has 31 days");
            case 2 -> System.out.println("The month has 28 days");
            case 4, 6, 9, 11 -> System.out.println("The month has 30 days");
            default -> System.out.println("No number between 1-12 typed in");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"
        System.out.println("Select a class, write it correct down (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric)");

        UserInput.nextLine();
        String rpp = UserInput.nextLine();

        switch (rpp) {
            case "1-Warrior" -> System.out.println("Strength: 10, Agility: 4, Intelligence: 3");
            case "2-Mage" -> System.out.println("Strength: 5, Agility: 6, Intelligence: 5");
            case "3-Rogue" -> System.out.println("Strength: 7, Agility: 6, Intelligence: 4");
            case "4-Cleric" -> System.out.println("Strength: 2, Agility: 5, Intelligence: 10");
            default -> System.out.println("You didn't write it correct");

        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi
        System.out.println("Write down the number which should get translated from 0-9");
        byte wordnumber = UserInput.nextByte(); ;
        System.out.println("Write down a number from 1-3 for the language (1: German. 2: English 3: English)");
        byte wordlanguage = UserInput.nextByte();

        switch (wordlanguage){
            case 1 -> {
                switch (wordnumber) {
                case 0 -> System.out.println("Null");
                case 1 -> System.out.println("Eins");
                case 2 -> System.out.println("Zwei");
                case 3 -> System.out.println("Drei");
                case 4 -> System.out.println("Vier");
                case 5 -> System.out.println("Fünf");
                case 6 -> System.out.println("Sechs");
                case 7 -> System.out.println("Sieben");
                case 8 -> System.out.println("Acht");
                case 9 -> System.out.println("Neun");
                default -> System.out.println("Your number is not between 0-9");
            }
            }
          case 2-> {
              switch (wordnumber) {
              case 0 ->  System.out.println("Zero");
              case 1 ->  System.out.println("One");
              case 2 ->  System.out.println("Two");
              case 3 ->  System.out.println("Three");
              case 4 ->  System.out.println("Four");
              case 5 ->  System.out.println("Five");
              case 6 ->  System.out.println("Six");
              case 7 ->  System.out.println("Seven");
              case 8 ->  System.out.println("Eight");
              case 9 ->  System.out.println("Nine");
              default -> System.out.println("Your number is not between 0-9");
            };
          }
          case 3-> {
              switch (wordnumber) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("ichi");
                case 2 -> System.out.println("ni");
                case 3 -> System.out.println("san");
                case 4 -> System.out.println("shir");
                case 5 -> System.out.println("go");
                case 6 -> System.out.println("roku");
                case 7 -> System.out.println("nana");
                case 8 -> System.out.println("hachi");
                case 9 -> System.out.println("kyuu");
                default -> System.out.println("Your number is not between 0-9");
            };
          }
            default -> System.out.println("Your number is not between 1-3");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!
        System.out.println("Small calculator, write down a number between 0 and 9");
        byte numberOne = UserInput.nextByte();
        System.out.println("Write down a second number");
        byte numberTwo = UserInput.nextByte();
        System.out.println("Write down if you want addition 1, substraction 2, division 3 and multiplication 4");
        byte operator = UserInput.nextByte();

        switch (operator) {
            case 1 -> System.out.println(numberOne + numberTwo);
            case 2 -> System.out.println(numberOne - numberTwo);
            case 3 -> {
                if (numberOne == 0 || numberTwo == 0) {
                    System.out.println("You are not allowed to make a division with 0");
                        }
                        else { System.out.println(numberOne / numberTwo); }
            }
            case 4 -> System.out.println(numberOne * numberTwo);
            default -> System.out.println("Maybe try to write it correct down");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.

        UserInput.close();
    }
}