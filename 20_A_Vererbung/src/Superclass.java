public class Superclass {
    public int value;

    public void printValue() {
        System.out.println("Point value: " + this.value);
    }

    public Superclass() {
        System.out.println("Hello from Superclass");
    }

    public Superclass(int value) {
        this.value = value;
    }

    String name = "base";

    String getName(){
        return  this.name;
    }
}
