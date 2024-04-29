package Lec9;

import java.util.Scanner;

public class TestArrayIndexOutOfBoundsException {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int number = input.nextInt();

        try{
            indexValue(number);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }

    public static void indexValue(int number) throws ArrayIndexOutOfBoundsException{
        int[] array = new int[120];
        for(int i=0; i<120; i++){
            array[i] = (int)(1 + Math.random() * 1000);
        }

        if(number>=120 || number<0){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }else{
            System.out.println("The Element is " + array[number]);
        }
    }
}
