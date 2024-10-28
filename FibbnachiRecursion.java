/**
 * FibbnachiRecursion
 */
public class FibbnachiRecursion {
    static int g=0;
    static int fibonachi(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        return fibonachi(n-1)+fibonachi(n-2);
    }

    static int sum( int n){
        if(n==1) return 0;
        g=fibonachi(n);
        return g+sum(n-1);
    }
    public static void main(String[] args) {
        int n=7;
        
        System.out.println(FibbnachiRecursion.sum(n));
    }
}