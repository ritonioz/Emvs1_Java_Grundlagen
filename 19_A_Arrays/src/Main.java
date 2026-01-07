public class Main{
    public static void main(String[]args){
   /*     //String[] names = {"name1","name2" usw.};
        String[] names = new String[10];
        names [0] = "Primis";
        names [1] = "Antonio";
        names [2] = "Dresi";
        names [3] = "Finnboy";
        names [4] = "Bljakaj";
        names [5] = "Anthamattan";
        names [6] = "Lukas";
        names [7] = "Sedro";
        names [8] = "Sindromy";
        names [9] = "Alfred";

        System.out.println(names[4]);
        System.out.println(names[1]);

        names [0] = "Primus";
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println();

        for(String name : names){
            System.out.println(name);
        }
        System.out.println();
        for (int i = 2; i < names.length -2; i++){
            System.out.println(names[i]);
        }
        */
        //2. cleanup
        /*
        NamesArray test = new NamesArray();
        test.printValueAtIndex5();
        test.printMyName();
        test.printArrayLength();
        test.loopThroughArray();
        test.foreachLoopThroughArray();
        System.out.println();
        test.printArrayValuesFromTo(2,8);
        */
        //3. Check your NamesArray implementation
        NamesArray namesArray = new NamesArray();

        /*namesArray.printValueAtIndex5();
        System.out.println();
        namesArray.printMyName();
        System.out.println();
        namesArray.printArrayLength();
        System.out.println();
        namesArray.loopThroughArray();
        System.out.println();
        namesArray.foreachLoopThroughArray();
        System.out.println();
        namesArray.printArrayValuesFromTo(2,8);
        System.out.println();
        namesArray.printArrayValuesFromTo(4,6);
        System.out.println();*/
        namesArray.printArrayValuesFromTo(8,2);
    }
}