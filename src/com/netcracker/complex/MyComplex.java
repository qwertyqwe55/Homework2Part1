package com.netcracker.complex;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    @Override
    public String toString() {
        return real + " + (" + imag + "i)";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void setValue(double real, double iamg){
        this.imag = iamg;
        this.real = real;
    }

    public boolean isImaginary(){
        return Math.abs(Double.compare(imag,0.0)) != 0;
    }

    public boolean isReal(){
        return Math.abs(Double.compare(real,0.0)) != 0;
    }


    public boolean equals(double real, double imag){
        return Double.compare(this.real,real) == 0 && Double.compare(this.imag,imag) == 0;
    }



    @Override
    public boolean equals(Object o) {

        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 && Double.compare(myComplex.imag, imag) == 0;
    }


    public double magnitude(){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }

    public double argument(){
        return isReal() ? Math.atan(imag/real) : 0;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(real + right.real, imag + right.imag);
    }
    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(real - right.real, imag - right.imag);
    }
    public MyComplex add(MyComplex right){
        real += right.real;
        imag += right.imag;
        return this;
    }
    public MyComplex multiply(MyComplex right){
        real *= right.real;
        imag *= right.imag;
        return this;
    }
    public MyComplex subtract(MyComplex right){
        real -= right.real;
        imag -= right.imag;
        return this;
    }
    public MyComplex divide(MyComplex right){
        real /= right.real;
        imag /= right.imag;
        return this;
    }

    public MyComplex conjugate(){
        return new MyComplex(real,-imag);
    }


//
//    public boolean equals(MyComplex another) {
//        return Double.compare(another.getReal(), real) == 0 && Double.compare(another.getImag(), imag) == 0;
//    }




    public MyComplex() {
    }
}
