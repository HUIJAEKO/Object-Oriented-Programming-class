package Lec6;

import java.util.Scanner;

public class IntersectionPoint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,x4,y4;
        System.out.print("x1,y1,x2,y2,x3,y3,x4,y4 : ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        x4 = input.nextDouble();
        y4 = input.nextDouble();

        //slope m = (y2-y1) / (x2-x1) = -a/b
        //a = y2-y1, b = x1-x2
        double a = y2 - y1;
        double b = x1 - x2;
        double e = (a * x1) + (b * y1);
        double c = y4 - y3;
        double d = x3 - x4 ;
        double f = (c * x3) + (d * y3);


        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if(linearEquation.isSolvable()){
            System.out.println("intersection point is " + linearEquation.getX() + ", " +linearEquation.getY());
        }else{
            System.out.println("The equation has no solution");
        }

    }
}
