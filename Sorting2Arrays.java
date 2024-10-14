/**
 * Sorting2Arrays
 */
public class Sorting2Arrays {

    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9,11,13,15};
        int arr2[]={2,6,8,10,18};
        int z=(arr1.length)+(arr2.length);
        int arrf[]=new int [z];
        int i=0,j=0,f=0;
        if(arr1[i]<arr2[j]){
                            arrf[f]=arr1[i];
                            f++;
                            i++;
                            while(i<arr1.length && j<arr2.length){
                                                        if(arr1[i]<arr2[j]){arrf[f]=arr1[i];
                                                        i++;
                                                        f++;
                                                                 }
                                                        else{
                                                            arrf[f]=arr2[j];
                                                            f++;
                                                            j++;
                                                        }
                            }
                        if(i>=arr1.length) {
                                            while (f<z) {arrf[f]=arr2[j];
                                                    j++;
                                                    f++;
                                                
                                            }
                        }
                        else{
                            while (f<z) {arrf[f]=arr1[i];
                                i++;
                                f++;
                            
                        }
                        }
                        
        }
        else{
            
                arrf[f]=arr2[j];
                f++;
                j++;
                while(i<arr1.length && j<arr2.length){
                                            if(arr1[i]<arr2[j]){arrf[f]=arr1[i];
                                            i++;
                                            f++;
                                                     }
                                            else{
                                                arrf[f]=arr2[j];
                                                f++;
                                                j++;
                                            }
                }
            if(i>=arr1.length) {
                                while (f<z) {arrf[f]=arr2[j];
                                        j++;
                                        f++;
                                    
                                }
            }
            else{
                while (f<z) {arrf[f]=arr1[i];
                    i++;
                    f++;
                
            }
            }
            
}
        
        for(int b=0;b<arrf.length;b++){
            System.out.println(arrf[b]);
        }
    }
}