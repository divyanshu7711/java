/**
 * MethodOverloading
 */
public class MethodOverloading {

    void displays(){
        System.out.println("hello");

    }
    void displays(String name ){
        System.out.println(name);

    }
    void displays(String name, int roll){
        System.out.println(name+" & "+roll);

    }
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.displays();
        m.displays("Divyanshu Sharma");
         m.displays("dev", 756);
    }
}