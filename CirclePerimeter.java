import java.util.*;
//perimeter of circle= 2*pi*r
public class CirclePerimeter{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float pi = 3.14f;
    float rad = sc.nextFloat();
    float perimeter= 2*pi*rad;
    System.out.println("Perimeter of Circle is: " + perimeter);

    }
}