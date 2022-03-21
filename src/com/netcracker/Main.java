package com.netcracker;

import com.netcracker.complex.MyComplex;
import com.netcracker.polinom.MyPolynomial;

public class Main {
    public static void main(String[] args) {
       testComplex();
        System.out.println("================================================");
        testPolynom();



    }

    public static void testPolynom(){
        System.out.println("Polynomial test");
        MyPolynomial polynomial = new MyPolynomial(1.123,2.421,3.421,4.5);
        MyPolynomial polynomial1 = new MyPolynomial(2,3,5.123,8.123,8.0);
        System.out.println("The first polynomial: " + polynomial);
        System.out.println("The second polynomial: " + polynomial1);
        System.out.println("Degree first polynomial: " + polynomial.getDegree());
        System.out.println("Degree second polynomial: " + polynomial1.getDegree());
        System.out.println("The sum polynomials: " + polynomial.add(polynomial1));
        System.out.println("The multiply polynomials: " + polynomial.multiply(polynomial1));
        System.out.println("Evaluate x = 2.0: " + polynomial.evaluate(2.0));
    }

    public static void testComplex(){
        System.out.println("Complex test");
        MyComplex myComplex = new MyComplex(2.0,-3.0);
        MyComplex myComplex1 = new MyComplex(2.0,3.0);
        System.out.println(myComplex);
        System.out.println(myComplex1);
        System.out.println("Summa complex 2.0 + (-3.0i) + 2.0 + (3.0i) = " + myComplex.add(myComplex1));
        System.out.println("Summa complex 4.0 + (0.0i) + 2.0 + (3.0i) with create new instance: " + myComplex.addNew(myComplex1));
        System.out.println("Conjugate complex: " + myComplex.conjugate());
        myComplex.setReal(2.0);
        myComplex.setImag(-3.0);
        System.out.println("Checking for the real part:" + myComplex.isReal());
        System.out.println("Checking for the imaginary part:" + myComplex.isImaginary());
        System.out.println("Compare 2.0 + (-3.0i) and 2.0 + (3.0i): " + myComplex.equals(myComplex1));
        System.out.println("Compare 2.0 + (-3.0i) and 2.0 + (-3.0i): " + myComplex.equals(2.0,-3.0));
        System.out.println("Module complex digit:" + myComplex.magnitude());
        System.out.println("Argument complex digit: " + myComplex.argument());

    }

}
