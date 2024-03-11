package java_class;

import java.util.Scanner;

public class Lec3_Practice2 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		int computerScore = 0;
		int userScore = 0;
					
		while(true) {			
			System.out.print("scissor(0), rock(1), paper(2): ");
			int user = input.nextInt();
			int computer = (int)(Math.random()*3);			
			//wrong number
			if(user != 0 & user != 1 & user != 2) {
				System.out.println("input number is 0 or 1 or 2");
			//right number	
			}else {
				//user win
				if(user==1 & computer==0 | user==2 & computer==1 | user==0 & computer==2) {
					userScore++;
					System.out.println("You won");
				//computer win
				}else if(user==0 & computer==1 | user==1 & computer==2 | user==2 & computer==0) {
					computerScore++;
					System.out.println("You lose");
				//draw
				}else {
					System.out.println("One more time");
				}
				//score difference of 2 points 
				if(computerScore==userScore+2) {
					System.out.println("You lose more than two times");
					break;
				}else if(userScore==computerScore+2) {
					System.out.println("You won more than two times");
					break;
				}		
			}			
		}
	input.close();
	}
}
