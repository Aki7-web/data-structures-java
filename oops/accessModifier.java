//While overriding, access level cannot be reduced.

// u can

// keep same access
// increase visibility

// But cannot make it more restrictive.

public class accessModifier {
    
}

// Shape.java
class Shape {

    protected void display() {
        System.out.println("Display-base");
    }
}

// Circle.java
class Circle extends Shape {

    @Override
    protected void display() { //or use public for overriding 
        System.out.println("Display-derived");
    }
}