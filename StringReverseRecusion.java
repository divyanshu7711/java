/**
 * StringReverseRecusion
 */
public class StringReverseRecusion {
    static String reversed(String str){
        
        int n= str.length();
        String rev="";
        if (n==-1) return rev;
       rev=rev+return(str.charAt(n-1));
    }
    public static void main(String[] args) {
        String str="ram";
         StringReverseRecusion.reversed(str);
    }
}