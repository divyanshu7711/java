//Write a program to swap two numbers without using a third variable.


public class swapping {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);

    }

    
}