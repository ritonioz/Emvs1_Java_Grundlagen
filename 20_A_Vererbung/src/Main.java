public class Main{
    public static void main(String[]args){
        Subclass test01 = new Subclass();
        test01.value = 5;
        test01.increment();
        test01.increment();
        test01.printValue();

        Superclass parentA = new Superclass();
        System.out.println(parentA.value);

        Superclass parentB = new Superclass();
        System.out.println(parentB.value);

        Subclass childA = new Subclass();
        System.out.println(childA.value);

        Subclass childB = new Subclass(55);
        System.out.println(childB.value);

        Superclass parent = new Superclass();
        Subclass child = new Subclass();
        System.out.println(parent.name);
        System.out.println(child.name);

        System.out.println(parent.getName());
        System.out.println(child.getName());

        //Task 2

        // Point
        Point p_default = new Point();
        Point p_unique = new Point(5, 10, "yellow");
        System.out.println(p_default.getColor()); // black
        System.out.println(p_unique.getColor()); // yellow
        p_default.printPoints(); // x: 0, y: 0,
        p_unique.printPoints(); // x: 5, y: 10,
// Point3D
        Point3D p3D_default = new Point3D();
        Point3D p3D_unique = new Point3D(10, 5, 100, "orange");
        System.out.println(p3D_default.getColor()); // black
        System.out.println(p3D_unique.getColor()); // orange
        p3D_default.printPoints(); // x: 0, y: 0, z: 0,
        p3D_unique.printPoints(); // x: 10, y: 5, z: 100,
    }
}