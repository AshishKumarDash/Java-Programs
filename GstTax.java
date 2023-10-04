/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
*/ 
import java.util.*;
public class GstTax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;

        System.out.println("Bills is: " + total);
        // add on 18% = 0.18f gst tax
        float newtotal = total +(0.18f*total);
        System.out.println("Bills of newtotal after tax is: " + newtotal);


    }
}