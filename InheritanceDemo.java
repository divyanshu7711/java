/**
 * InheritanceDemo
 */
/**
 * InnerInheritanceDemo
 */
class mannager{
    void displaysName(String name){
        System.out.println(name);
    }
    void getSalary(){
        System.out.println("its  not done ");
    }

    
}
class emp extends mannager{

}
public class InheritanceDemo {
public static void main(String[] args) {
    emp e=new emp();
    e.displaysName("divyanshu");
    e.getSalary();

}
    
}