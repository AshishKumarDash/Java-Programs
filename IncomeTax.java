/* income< 5 lakhs 0% tax , income between 5 to 10 lakhs 20% tax
income > 10 lakhs 30% tax
Not Solved yet */
import java.util.*;
public class IncomeTax{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int income= sc.nextInt();
        int tax;
        if(income<500000){
            tax = 0;
        }
        else if(income>=500000 && income<1000000){
            tax =  (int)(income*0.2);
        }
        else{
            tax =(int) (income*0.3);
        }
        System.out.println("Your Tax is : " + tax);
    }
}