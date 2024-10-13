//Write a program to print a multiplication table for any number (up to 10).

import java.util.Scanner;
/**
 * table
 */
public class table {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=s.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(i*n);
        }
        s.close();
    }
}