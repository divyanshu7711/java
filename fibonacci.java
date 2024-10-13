// Write a program to print the first 10 Fibonacci numbers. 
/**
 * fibonacci
 */
public class fibonacci {

    public static void main(String[] args) {
        int a=0 ;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=10;
        for(int i=0 ; i<(n-2);i++){
            int x=a+b;
            System.out.println(x);
            a=b;
            b=x;
            
        }
    }
}