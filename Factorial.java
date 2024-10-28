/**
 * Factorial
 */
public class Factorial {
    static int fact(int n){
        
        if(n>1) {return n*fact(n-1);}
        else if(n==1){return 1;}
        else return -1;
    }

    public static void main(String[] args) {
        int a=7;
       System.out.println( Factorial.fact(a));


    }

}