public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber; // Not Valid, starts with number

        // int firstNumber; // Valid

        // int tryThisNumber; // Valid

        // int _myNumber; // Valid, but underscore can make trouble

        // int int; // Not Valid, name can't be a Variable

        // int _number_;  // Valid, underscore can make trouble

        // int i; // Valid

        // int number1; // Valid

        // int .product; Not Valid, starts with point

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1; // recommended
        int speed; // not recommended, speed of what?
        int JustANUmber; // recommended
        int justAnotherNumber; // recommended
        int _weather; // not recommended, starts with underscore
        int _Id; // not recommended, starts with underscore
        int $Money; // not recommended, $ can cause problems
        int moneyinthebankaccount; // not recommended, try a word that describes the sentence like 'bankBalance'
        int aLotOfmoneyonbankAccount; // not recommended, try 'highBankBalance'
        int circumstanceEarthInKM; // I do not know if it is smaller possible
        int circumstanceEarth_KM; // not recommended, circumstanceEarthInKM is in my opinion better

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitkommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;

        char meinUnicodeZeichen = '\u003D';

        short meineKleineGanzzahl = 200;

        char meinBuchstabe = 'B';

        float meineNegativeGleitkommaZahl = -14.612f;

        double meineGrosseGleitkommaZahl = 50.1234567890123d;

        boolean meinWahrheitswert1 = false;

        int meineNormaleGanzzahl = 50_000;

        long meineGrosseGanzzahl = 123_456_789_012_345L;

        boolean meinWahrheitswert2 = true;


        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int monyInBankAccount = 100_000; // bankBalance can change rapid

        final short myBirthyear = 2001; // your Birthyear never changes

        final byte amountOfMonths = 12; // there are always 12 months

        final float gravityForce = 9.81f; // i believe it is always the same

        final byte amountOfMinutesPerHour = 60; // always 60

        final short amountOfSecondsPerHour = 3600; // always the same

        final float pi = 3.14159f; // pi never changes

        short amountOfStudents = 167; // can change

        //--------------------------------------------------------------------------------------------------------------
    }
}