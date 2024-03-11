package java_class;

import java.util.Scanner;

public class Lec3_Practice1 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number of lines(0~15): ");		
		
		int num = input.nextInt();
		//wrong number
		if(num<0 | num>15) {
			System.out.println("Enter 0~15");
		//right number
		}else {
			for(int i=1; i<=num; i++) {
				if(i<10) {System.out.print(" ");}
				//space before number
				int j=i;
				while(j<num) {		
					if(j<10) {
						System.out.print("  ");
					}else {
						System.out.print("   ");	
					}
					j++;
				}
				//num~1
				for(int n=i; n<=num; n--) {
					if(n<=0) {
						break;
					}else {
						System.out.print(n);
						System.out.print(" ");
					}
				}
				//2~num
				for(int k=2; k<=i; k++) {
					System.out.print(k);
					System.out.print(" ");
				}
				//space after number	
				int m=i;
				while(m<num) {
					System.out.print("  ");	
					m++;
				}
				//change layer
				System.out.println();
			}	
		}		
		input.close();
	}
}
