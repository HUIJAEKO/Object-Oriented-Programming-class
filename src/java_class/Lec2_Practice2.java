package java_class;

import java.util.Scanner;

public class Lec2_Practice2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter three edges (length in double):");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//삼각형의 가장 긴 변은 나머지 두 변의 길이의 합보다 작아야함.
		//즉, 무작위로 선택한 두 변의 길이의 합이 항상 나머지 변의 길이보다 커야한다는 것을 의미.
		if(a+b>c & a+c>b & b+c>a) {
			System.out.println("The perimeter is " + (a+b+c));
		}else {
			System.out.println("Input is invalid");
		}		
		
		input.close();
	}

}

