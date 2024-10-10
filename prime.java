// Write a program to check whether a given number is prime.


public class prime {
    public static void main(String[] args) {
        int a=313798;
        int count=0;
        if (a==0 || a==1) { 
            System.out.println("not a prime");
        }
        else if(a==2)System.out.println("prime");
        else{
        for(int i=2;i<a;i++){
                if(a%i==0) {count++;
                            break;}
        }
        if (count==0) {
            System.out.println("prime");
        }
        else System.out.println("not a prime ");
    }
    
}
}