    public class NamesArray {
    public String[] names = new String[10];

    public NamesArray(){
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

        names [0] = "Primus";
    };
    public void printValueAtIndex5(){
        System.out.println(names[4]);
    }
    public void printMyName(){
        System.out.println(names[1]);
    }
    public void printArrayLength(){
        System.out.println(names.length);
    }
    public void loopThroughArray(){
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
    public void foreachLoopThroughArray(){
        for(String name : names){
            System.out.println(name);
        }
    }
    public void printArrayValuesFromTo(int startPos, int endPos){
        while(startPos<endPos){
                System.out.println(names[startPos]);
            startPos++;

            while (startPos>endPos){
                System.out.println(startPos);
                startPos--;
            }
        }
    }
}