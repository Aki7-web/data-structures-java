import java.util.*;


//q1 Print the sum,difference and product of two complex numbers by creating a 
// class named 'Complex' with separate methods for each operation whose real 
// and imaginary parts are entered by the user

public class complexClass {
    public static void main(String[] args) {
        Complex c= new Complex();
        c.sum();
        c.difference();
        c.multiplication();
    }
}

class Complex{
    
    int x1;
    int y1;
    int x2;
    int y2;

    Complex(){
        System.out.println("enter real and imaginar parts one by one for two complex numbers");
        Scanner sc= new Scanner(System.in);
        this.x1= sc.nextInt();
       this.y1= sc.nextInt();
        this.x2= sc.nextInt();
        this.y2= sc.nextInt();
        //System.out.println("complex numbers are "+ x1+"+"+y1+"i"+","+x2+"+"+y2+"i");
    }
    
    void sum(){
        System.out.println((x1+x2)+"+"+"("+ (y1+y2)+")" + "i"); 
    }
    void difference(){
        System.out.println((x1-x2)+ "+"+"("+(y1-y2)+")" + "i"); 
    }
    void multiplication(){
        System.out.println(((x1*x2)-(y1*y2))+"+"+ "("+((x1*y2)+(x2*y1))+")" + "i"); 
    }
}


// better ans

// import java.util.*;

// class Complex {

//     int real;
//     int imag;

//     // Constructor
//     public Complex(int r, int i) {
//         real = r;
//         imag = i;
//     }

//     // Addition
//     public static Complex add(Complex a, Complex b) {
//         return new Complex(
//             (a.real + b.real),
//             (a.imag + b.imag)
//         );
//     }

//     // Difference
//     public static Complex diff(Complex a, Complex b) {
//         return new Complex(
//             (a.real - b.real),
//             (a.imag - b.imag)
//         );
//     }

//     // Product
//     public static Complex product(Complex a, Complex b) {
//         return new Complex(
//             ((a.real * b.real) - (a.imag * b.imag)),
//             ((a.real * b.imag) + (a.imag * b.real))
//         );
//     }

//     // Printing complex number
//     public void printComplex() {

//         if (real == 0 && imag != 0) {  //here real itself means this.real i.e the real part of the object calling this fctn
//             System.out.println(imag + "i");
//         }

//         else if (imag == 0 && real != 0) {
//             System.out.println(real);
//         }

//         else {
//             System.out.println(real + "+" + imag + "i");
//         }
//     }
// }

// class Solution {

//     public static void main(String[] args) {

//         Complex c = new Complex(4, 5);
//         Complex d = new Complex(9, 4);

//         Complex e = Complex.add(c, d);
//         Complex f = Complex.diff(c, d);
//         Complex g = Complex.product(c, d);

//         e.printComplex();
//         f.printComplex();
//         g.printComplex();
//     }
// }