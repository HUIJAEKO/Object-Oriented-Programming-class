package Lec7;

public class MyInteger {
    private int value;
    public MyInteger(int value){
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public boolean isPrime(){
        return isPrime(this.value);
    }
    public static boolean isPrime(int value){
        for(int i = 2; i<value; i++){
            if(value % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(MyInteger value){
        return isPrime(value.getValue());
    }
}
