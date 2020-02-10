package com.company;

public class Complex {
    double first;
    double second;
    public Complex (double a){
        first = a;
        second = 0.0;
    }
    public Complex (double a, double b){
        first = a;
        second = b;
    }
    public double abs (){
        double answer = Math.sqrt(first * first + second * second);
        return answer;
    }
    public Complex add (Complex other){
        double addFirst = first + other.first;
        double addSecond = second + other.second;
        return new Complex (addFirst, addSecond);
    }
    public String toString (){
        String answer = first + " + " + second + "i";
        return answer;
    }
    public Complex multiply (Complex other){
        double multiplyFirsts = first * other.first;
        double multiplyFirstAndSecond = first * other.second;
    }
    public static void main(String[] args){
        Complex a = new Complex(6.9, 7.5);
        System.out.println (a.abs());
        Complex b = new Complex (4.2, 3.7);
        System.out.println(b.add(a));
        System.out.println(a);
    }
}
