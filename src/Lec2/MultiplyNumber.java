package Lec2;

import java.util.Scanner;

public class MultiplyNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter an integer between 0 and 1000:");
		
		int number = input.nextInt();
		
		if(number>=100){
			int a = number/100;
			int b = number/10%10;
			int c = number%10;
			System.out.println("The multiplication of all digits in " + number + " is " + a*b*c );
		}else if(number>=10){
			int b = number/10;
			int c = number%10;
			System.out.println("The multiplication of all digits in " + number + " is " + b*c );
		}else{
			System.out.println("The multiplication of all digits in " + number + " is " + number );
		}
		
		
		
		input.close();
	}

}