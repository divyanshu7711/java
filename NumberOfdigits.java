// Write a program to count the number of digits in a number.
// 	Write a program to print the sum of the digits of a number.
/**
 * NumberOfdigits
 */
public class NumberOfdigits {

    public static void main(String[] args) {
        int n=5589612;
        int ans=0;
        int sum=0;
        while (n!=0) {
            ans++;
           
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println(ans);
        System.out.println(sum);
    }
}
