/**
 * MultipleCatch
 */
public class MultipleCatch {

    public static void main(String[] args) {
        try{
            System.out.println(5/0);
            int ar[]=new int[5];
            System.out.println(ar[5]);
            System.out.println("hello world");
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     e.printStackTrace();
        // }
        // catch(ArithmeticException e){
        //     e.printStackTrace();
        // }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
// public class MultipleCatch {
//     public static void main(String[] args) {
//         try {
//             int[] numbers = {10, 20};
//             int result = numbers[1] / 0; // This will cause ArithmeticException
//             System.out.println("Result: " + result);
//             System.out.println("Third element: " + numbers[2]); // This will cause ArrayIndexOutOfBoundsException
//         } catch (ArithmeticException e) {
//             System.out.println("Caught ArithmeticException: " + e.getMessage());
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Caught general Exception: " + e.getMessage());
//         }
//     }
// }