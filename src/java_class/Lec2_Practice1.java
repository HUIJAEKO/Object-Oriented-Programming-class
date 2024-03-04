package java_class;

import java.util.Scanner;

public class Lec2_Practice1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter an integer between 0 and 1000:");
		
		int number = input.nextInt();
		
		//100의자리
		int a = number/100;
		//10의자리
		int b = number/10%10;
		//1의자리
		int c = number%10;
		
		System.out.println("The multiplication of all digits in " + number + " is " + a*b*c );
		
		input.close();
	}

}
