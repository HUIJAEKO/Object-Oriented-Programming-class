package Lec4;

import static Lec4.Reverse.isPalindrome;
import static Lec4.Reverse.reverse;
public class Emirp {
    public static void main(String[] args) {
        int total = 0;
        int number = 2;
        int reversedNumber = 0;

        while(total < 120){
            if(isPalindrome(number)){
                number++;
            }else {
                reversedNumber = reverse(number);
            }
            if(primeTest(number) && primeTest(reversedNumber)){
                System.out.print(number + " ");
                total++;
                number++;
                if (total%10 == 0){
                    System.out.println();
                }
            }else{
                number++;
            }
        }
    }
    public static boolean primeTest(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}


