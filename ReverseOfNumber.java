// Write a program to print the reverse of a number.

/**
 * ReverseOfNumber
 */
public class ReverseOfNumber {
            public static void main(String[] args) {
                    int n=576;
                    int f=0;
                    while (n>0) {
                        int a= n%10;
                       f=f*10+a;
                        n=n/10;
                    }
                    System.out.println(f);
            }
    
}