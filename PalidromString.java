/**
 * PalidromString
 */
public class PalidromString {

    public static void main(String[] args) {
        String str="kanak kanak";
        int l=str.length()-1;
        int i=0,count=0;

        while(l>i){
            if(str.charAt(l)!=str.charAt(i)) count++;
            l--;
            i++;
        }
        if (count==0) System.out.println("Yes, "+str+" is a palidrom String.");
        else System.out.println("No, "+str+" is a not palidrom String.");
        
    }
}