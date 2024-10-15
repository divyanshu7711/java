//Write a program to find the number of occurrences of a character in a string.
/**
 * NumberOfOccurance
 */
public class NumberOfOccurance {

    public static void main(String[] args) {
        String str="helllo this side divyanshu";
        int n= str.length()-1;
        int count=0;
        while(n>=0){
                if(str.charAt(n)=='i') count++;
                n--;
                
        }
        System.out.println(count);
    }
}