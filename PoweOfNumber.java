/**
 * PoweOfNumber
 */
public class PoweOfNumber {
                static int power(int number, int power){
                    if(power==0) return 1;
                    if (power==1) return number;
                    return number*power(number, power-1);

                }
    public static void main(String[] args) {
        int a=3;
        int b=4;
        System.out.println(PoweOfNumber.power(a,b));
    }
}