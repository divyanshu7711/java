// Write a program to reverse a string using recursion.

/**
 * StringReverseRecursion
 */
public class StringReverseRecursion {
                static String rever="";
                static String reverse(String str,int n){
                    if(n==0) return  str.charAt(0);
                    return  (String) rever+str.charAt(n)+reverse(str,n-1);
                }
                public static void main(String[] args) {
                    String str="radhe";
                    int n=str.length()-1;
                    System.out.println(StringReverseRecursion.reverse(str,n));

                }
    
}