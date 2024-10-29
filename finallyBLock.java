/**
 * finallyBLock
 */
public class finallyBLock {

    public static void main(String[] args) {
        try {
             System.out.println("ram ram bhai ");
             return ;
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            System.out.println("chln naa");
        }
        System.out.println("kya be lodu"); 
        // yeh hr baar run hoga jb tk return hi na krde in try catch 
    }
}