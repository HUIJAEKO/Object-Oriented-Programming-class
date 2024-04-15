package Lec7;

import java.util.Scanner;

import static Lec7.MyInteger.isPrime;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, count = 0;
        MyInteger[] myInteger = new MyInteger[3];
        System.out.println("Enter the integer: ");
        num = input.nextInt();

        while(num != -1){
            if(count >= myInteger.length){
                MyInteger[] newMyInteger = new MyInteger[myInteger.length * 2];
                System.arraycopy(myInteger, 0, newMyInteger, 0, myInteger.length);
                myInteger = newMyInteger;
            }
        myInteger[count] = new MyInteger(num);
        count++;
        System.out.println("Enter the integer: ");
        num = input.nextInt();
        }

        for (int i=0; i<count; i++) {
            System.out.print(myInteger[i].getValue());
            if (MyInteger.isPrime(myInteger[i].getValue())) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }
}
