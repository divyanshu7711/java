 // Create a class Circle with methods to calculate area and perimeter. Write a program to test it.
/**
 * AreaParameter
 */
class Circle{
    float area(float radious){
        float f= (float) (3.14*radious*radious) ;
        return f;

    }
    float perimeter(float radious){
        float f= (float) (2*3.14*radious);
        return f;
    }
}
public class AreaParameter {

    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println(c.area(5.5f));
        System.out.println(c.perimeter(5.5f));
    }
}