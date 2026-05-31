

public class overriding {
    public static void main(String[] wheels) {

        final Car car = new ElectricCar(); //here final means the reference to this object cannot be changed
                                        //the object can be altered (ie its not immutable)
        System.out.print(car.drive()); //jjust that it cannnot be reassigned to a new adress
    }
}

class Automobile {

    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {

    protected String drive() {  //not overrided as the above method was invisible to this class
        return "Driving car";
    }
}

class ElectricCar extends Car {

    @Override
    public final String drive() { //this is overriding and final means this 
            return "Driving electric car";   // method no more can be overridden by futures childrens
    
    }
}
