import java.util.*;
public class LargestOf3{
    public static void main(String args[]){
        int A = 5 , B = 3 , C = 2;
        if((A>=B)&& (A>=C)){
            System.out.println("Largest is A");
        }
        else if(B>=C){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("Largest is c");
        }
    }
}