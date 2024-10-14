// Write a program to find the second largest number in an array.

import java.util.Scanner;

/**
 * largest2
 */
public class largest2 {


public static void main(String[] args) {
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
                    arr[i]=sc.nextInt();
                         }
    for(int i=0;i<5;i++){
                     System.out.print( arr[i]+" , ");  }
                     int max=arr[0];
                     
                     int max2=arr[0];
                     int count=0;
  for (int i=1;i<5;i++){
                           if(arr[i]>max ){ max2=max;
                                            max=arr[i];
                                            count++;
                           }
  }
  if (count>0) System.out.println(" 2nd maximum :"+max2);
  else{
    max2=arr[1];
    for (int i=2;i<5;i++){
        if(arr[i]>max2 ){ 
                         max2=arr[i];
                         
        }
        
            }
            System.out.println("max 2:"+max2);
  }
     sc.close();

}
}