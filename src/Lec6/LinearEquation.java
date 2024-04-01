package Lec6;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if(linearEquation.isSolvable()){
            System.out.println("x is " + linearEquation.getX() + " y is + " + linearEquation.getY());
        }else{
            System.out.println("The equation has no solution");
        }
    }

//    -----------------------
//    LinearEquation variable
//    -----------------------
//    a : double
//    b : double
//    c : double
//    d : double
//    e : double
//    f : double
//    -----------------------
//            method
//    -----------------------
//    getA() : double
//    getB() : double
//    getC() : double
//    getD() : double
//    getE() : double
//    getF() : double
//    getX() : double
//    getY() : double
//    isSolvable() : boolean
//    -----------------------
    private double a, b, c, d, e, f;
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getD() {
        return this.d;
    }
    public double getE() {
        return this.e;
    }
    public double getF() {
        return this.f;
    }

    public boolean isSolvable(){
        return a * d - b * c != 0;
    }

    public double getX() {
        if (isSolvable()) {
            return (e * d - b * f) / (a * d - b * c);
        } else {
            System.out.println("The equation has no solution");
        }
        return 0;
    }

    public double getY(){
        if(a * d - b * c != 0){
            return (a*f-e*c)/(a*d-b*c);
        }else{
            System.out.println("The equation has no solution");
        }
        return 0;
    }
}
