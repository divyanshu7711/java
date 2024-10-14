import java.util.Scanner;

public class ReverseArray {
    
    public static void main(String[] args) {
        int arr[]=new int[5];
                                Scanner sc=new Scanner(System.in);
                                for(int i=0;i<arr.length;i++){
                                                arr[i]=sc.nextInt();
                                                     }
                                for(int i=0;i<arr.length;i++){
                                                 System.out.print( arr[i]+" , ");  }

                                            int n= (arr.length) -1 ;  
                                            int i=0;   
                                while(n>i){
                                    int temp=arr[n];
                                    arr[n]=arr[i];
                                    arr[i]=temp;
                                    n--;
                                    i++;
                                }
                                for(int i=0;i<arr.length;i++){
                                    System.out.print( arr[i]+" , ");  }

    }
}
