package Lec5;

import java.util.Scanner;

public class Pivot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int number = input.nextInt();
        int[] numberArray = new int[number];

        System.out.print("Enter a list: ");
        for (int i = 0; i < number; i++) {
            numberArray[i] = input.nextInt();
        }

        int pivot = partition(numberArray);
        System.out.print("After the partiton, the lost is ");
        for (int i = 0; i < number; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }

    public static int partition(int[] numberArray){
        int split = numberArray[0];
        int left = 1;
        int right = numberArray.length - 1;

        do {
            while (left <= right && numberArray[left] <= split) {
                left++;
            }

            while (left <= right && numberArray[right] >= split) {
                right--;
            }

            if (right > left) {
                int num1 = numberArray[right];
                numberArray[right] = numberArray[left];
                numberArray[left] = num1;
            }

        } while (left < right);

        numberArray[0] = numberArray[right];
        numberArray[right] = split;
        return right;
    }
}

