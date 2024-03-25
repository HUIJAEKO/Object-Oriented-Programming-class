package Lec5;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args){
        int[][] employeeArray = new int[8][7];
        Scanner input = new Scanner(System.in);

        System.out.println("           Su M T W Th F Sa");
        for(int i=0; i<8; i++){
            System.out.print("Employee" + i + "   ");
            for(int j=0; j<7; j++){
                employeeArray[i][j] = input.nextInt();
            }
        }

        int[][] employeeTimeArray = new int[8][2];
        for(int i=0; i<8; i++){
            int totalTime = 0;
            for(int j=0; j<7; j++){
                totalTime += employeeArray[i][j];
            }
            employeeTimeArray[i][0] = i;
            employeeTimeArray[i][1] = totalTime;
        }
        Arrays.sort(employeeTimeArray, (a,b) -> b[1] - a[1]);

        for(int i=0; i<8; i++){
            System.out.println("Employee" + employeeTimeArray[i][0] + " : " + employeeTimeArray[i][1]);
        }
    }
}
