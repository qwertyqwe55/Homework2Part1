package com.netcracker.polinom;

import java.util.ArrayList;

public class MyPolynomial {

    ArrayList<Double> coeffs;

    @Override
    public String toString() {
        String polynom = "";
        for (int i = coeffs.size()-1; i >= 0; i--) {
            if(i==0){
                polynom += coeffs.get(i);
            }else if(coeffs.get(i) != 0) {
                polynom += coeffs.get(i) + "*x^" + i + "+";
            }
        }

        return polynom;
    }

    public int getDegree(){
        return coeffs.size()-1;
    }

    public MyPolynomial add(MyPolynomial right){
        ArrayList<Double> arrayList = new ArrayList<>();

        if (right.coeffs.size() > this.coeffs.size()) {
            for (int i = 0; i < coeffs.size(); i++) {
                arrayList.add(coeffs.get(i) + right.coeffs.get(i));
            }

            for (int i = arrayList.size(); i < right.coeffs.size(); i++) {
                arrayList.add(right.coeffs.get(i));
            }

        }else{
            for (int i = 0; i < right.coeffs.size(); i++) {
                arrayList.add(coeffs.get(i) + right.coeffs.get(i));
            }
            for (int i = arrayList.size(); i < right.coeffs.size(); i++) {
                arrayList.add(coeffs.get(i));
            }
        }
        return new MyPolynomial(arrayList);
    }

    public double evaluate(double x){
        double polynom = 0.0;
        for (int i = coeffs.size()-1; i >= 0; i--) {
                polynom += coeffs.get(i) * Math.pow(x,i);
            }

        return polynom;
    }


    public MyPolynomial multiply(MyPolynomial right){
        ArrayList<Double> arrayList = new ArrayList<>();

        if (right.coeffs.size() > this.coeffs.size()) {
            for (int i = 0; i < coeffs.size(); i++) {
                arrayList.add(coeffs.get(i) * right.coeffs.get(i));
            }

            for (int i = arrayList.size(); i < right.coeffs.size(); i++) {
                arrayList.add(right.coeffs.get(i));
            }

        }else{
            for (int i = 0; i < right.coeffs.size(); i++) {
                arrayList.add(coeffs.get(i) * right.coeffs.get(i));
            }
            for (int i = arrayList.size(); i < right.coeffs.size(); i++) {
                arrayList.add(coeffs.get(i));
            }
        }
        return new MyPolynomial(arrayList);
    }


    public MyPolynomial(ArrayList<Double> coeffs) {
        this.coeffs = coeffs;
    }

    public MyPolynomial(double... coeffs) {
        this.coeffs = new ArrayList<>();
        for (double x : coeffs) this.coeffs.add(x);
    }
}
