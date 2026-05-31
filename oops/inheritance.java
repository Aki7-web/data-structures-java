//Real order in inheritance

// For object creation:

// Parent static -- while class loads before child 
// Child static --  while class loads after parent
// Parent instance block-- before constructor of parent
// Parent constructor
// Child instance block
// Child constructor

public class inheritance {

     public static void main(String[] gears) {
        new BlueCar();
    }
    
}
abstract class Car {

    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

class BlueCar extends Car {

    {
        System.out.print("4");
    }

    public BlueCar() {
        super("blue");
        System.out.print("5");
    }
}
