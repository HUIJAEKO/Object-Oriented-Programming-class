package Lec7;

public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Test");
        String s = "Test";
        int a = 0;
        System.out.println(sb + " " + s + " " + a);
        test(sb,s,a);
        System.out.println(sb + " " + s + " " + a);
        test(sb,s);
        System.out.println(sb + " " + s + " " + a);
    }
    public static void test(StringBuilder sb, String s, int a){
        sb.append("New");
        s = "New";
        a = 10;
        System.out.println(sb + " " + s + " " + a);
    }
    public static void test(StringBuilder sb, String s){
        sb.append("New");
        s = "New";
        System.out.println(sb + " " + s + " ");
    }
}
