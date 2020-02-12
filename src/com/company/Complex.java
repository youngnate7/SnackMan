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
        double multiplySecondAndFirst = second * other.first;
        double multiplySeconds = second * other.second;
        double firstNew = multiplyFirsts - multiplySeconds;
        double secondNew = multiplyFirstAndSecond + multiplySecondAndFirst;
        return new Complex (firstNew, secondNew);

    }
    public static void main(String[] args){
        Complex a = new Complex(6.9, 7.5);
        System.out.println (a.abs());
        Complex b = new Complex (4.2, 3.7);
        System.out.println(b.add(a));
        System.out.println(a);
        System.out.println(b.multiply(b));
    }
}

// Output:
//10.191172650877817
//        11.100000000000001 + 11.2i
//        6.9 + 7.5i
//        3.9499999999999993 + 31.080000000000002i
//
//        Process finished with exit code 0
