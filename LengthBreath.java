// Create a class Rectangle with length and breadth, and methods to calculate area and perimeter. Test the class with multiple objects.
/**
 * LengthBreath
 */
  class Rectangle{
     float length;
     float breath;
     Rectangle(float length, float breath){
        this.length=length;
        this.breath=breath;
         }
    float area(){
        return (float)(length*breath);
    }
    float perimeter(){
        return (float)(2*(length+breath));
    }
}
public class LengthBreath {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10.5f, 5.7f);
        Rectangle r2=new  Rectangle(5.7f,9.8f);
        System.out.println("Area:"+r1.area()+"  perimeter: "+r1.perimeter());
        System.out.println("Area:"+r2.area()+"  perimeter: "+r2.perimeter());
    
    }
    
}