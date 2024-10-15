/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        String str="ramram";
        String fstr="";
        int n = str.length()-1;
        while(n>=0){
            fstr=fstr + str.charAt(n); 
            n--; 
        }
        System.out.println(fstr);
    }
}