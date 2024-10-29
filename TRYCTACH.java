/**
 * TRYCTACH
 */
public class TRYCTACH {

    
    public static void main(String[] args) {
        System.out.println("hello world , ");
        try {
            int arr[]=new int [5];
            
            System.out.println(arr[6]);
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }catch (Exception e) {
           e.printStackTrace();
        }
       
        System.out.println("what is your name");
    }
}