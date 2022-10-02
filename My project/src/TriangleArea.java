import java.util.Scanner;
public class TriangleArea {
    public void calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of the triangle");
        
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        float area= (base*height)/2;
        System.out.println("The area of triangle is"+area);
    }
}

