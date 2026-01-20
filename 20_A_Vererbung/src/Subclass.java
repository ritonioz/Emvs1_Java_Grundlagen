public class Subclass extends Superclass {

    public Subclass() {
        super();   // optional, wird automatisch aufgerufen
    }

    public Subclass(int value) {
        super(value);   // Wert an Superclass übergeben
    }

    public void increment() {
        value++;
    }
    String name = "derived";


}
