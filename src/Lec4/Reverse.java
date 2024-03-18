package Lec4;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer(1~9999): ");
        int number = input.nextInt();
        if(isPalindrome(number)){
            System.out.println(reverse(number) + " is palindrome");
        }else{
            System.out.println(reverse(number) + " is not palindrome");
        }
    }

    public static int reverse(int number) {
        int returnNumber;
        if (number >= 1000) {
            int a = number / 1000;
            int b = number / 100 % 10;
            int c = number % 100 / 10;
            int d = number % 100 % 10;
            returnNumber = d * 1000 + c * 100 + b * 10 + a;
        } else if (number >= 100) {
            int b = number / 100;
            int c = number % 100 / 10;
            int d = number % 100 % 10;
            returnNumber = d * 100 + c * 10 + b;
        } else if (number >= 10){
            int c = number / 10;
            int d = number % 10;
            returnNumber = d * 10 + c;
        } else{
            returnNumber = number;
        }

        return returnNumber;
    }


    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}

