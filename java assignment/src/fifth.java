import java.util.*;
class Circle{
    private double r;

    // Constructor
    public Circle(double radius){
        this.r= radius;
    }
    public double computeArea(){
        return Math.PI* r * r;
    }
    public double computeCircumference(){
        return 2 * Math.PI * r;
    }
}
public class fifth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your inner circle radius-ri:");
        double ri= scanner.nextDouble();
        System.out.println("Enter your outer circle radius-ro:");
        double ro= scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();

        double circularAreaRegion= outerArea - innerArea;

        System.out.println("Inner Area Circle:"+innerArea );
        System.out.println("Outer Area Circle:"+outerArea );
        System.out.println("Circular Region Area :"+ circularAreaRegion );
    }
}
