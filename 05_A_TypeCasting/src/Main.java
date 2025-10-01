public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.

        // Your code here
        byte myByte = 10 ;
        short myShort = 100 ;
        int myInt = 1000 ;
        long myLong = 10000L ;
        float myFloat = 1.52235f ;
        double myDouble = 3.64364533 ;
        char myChar = 2 ;

            myByte = (byte) myShort ;
            myByte = (byte) myInt ;
            myByte = (byte) myLong ;
        //  myByte = (byte) myChar ;
            myByte = (byte) myFloat ;
            myByte = (byte) myDouble ;

            myShort = (short) myByte ;
            myShort = (short) myInt ;
            myShort = (short) myLong ;
        //  myShort = (short) myChar ;
            myShort = (short) myFloat ;
            myShort = (short) myDouble ;

            myInt = (int) myByte ;
            myInt = (int) myShort ;
            myInt = (int) myLong ;
            myInt = (int) myChar ;
            myInt = (int) myFloat ;
            myInt = (int) myDouble ;

            myLong = (long) myByte ;
            myLong = (long) myShort ;
            myLong = (long) myInt ;
            myLong = (long) myChar ;
            myLong = (long) myFloat ;
            myLong = (long) myDouble ;

            myChar = (char) myByte ;
            myChar = (char) myShort ;
            myChar = (char) myInt ;
            myChar = (char) myLong ;
            myChar = (char) myFloat ;
            myChar = (char) myDouble ;

            myFloat = (float) myByte ;
            myFloat = (float) myShort ;
            myFloat = (float) myInt ;
            myFloat = (float) myLong ;
            myFloat = (float) myChar ;
            myFloat = (float) myDouble ;

            myDouble = (double) myByte ;
            myDouble = (double) myShort ;
            myDouble = (double) myInt ;
            myDouble = (double) myLong ;
            myDouble = (double) myChar ;
            myDouble = (double) myFloat ;





        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        // Your code here
        long longValue = 1234567890 ;
        int  intValue = (int) longValue ;
        System.out.println(intValue);

        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.

        // I think it is going to show 33+10 or something like 3310

        System.out.println(myNumber);

        // Can you explain what is happening?
        //* String is no number, string shows letters and in this example is the 33 as "33" written and the system thinks
        //* it is a letter and can not do maths


        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        // int houseNumber = (int) houseNumberInString;
        int houseNumber = Integer.parseInt(houseNumberInString);
         System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        //* You can not make a string so easy to an int, the problem is that string is no number, Java thinks it is a
        //* letter, I think you have to write down (int) before. It did not work :(
        //* The internet says I should write down int houseNumber = Integer.parseInt(houseNumberInString); and it is correct

    }
}