// 	Write a program to find the maximum and minimum elements in an array.

import java.util.Scanner;

/**
 * MaxMininArray
 */
public class MaxMininArray {
                            public static void main(String[] args) {
                                int arr[]=new int[5];
                                Scanner sc=new Scanner(System.in);
                                for(int i=0;i<5;i++){
                                                arr[i]=sc.nextInt();
                                                     }
                                for(int i=0;i<5;i++){
                                                 System.out.print( arr[i]+" , ");  }
                                                 int max=arr[0];
                                                 int min =arr[0];
                              for (int i=0;i<5;i++){
                                                       if(arr[i]>max ) max=arr[i];
                                                       if(arr[i]<min) min=arr[i];
                              }
                              System.out.println("min :"+min+" , max :"+max);
                                                 
     }
    
}