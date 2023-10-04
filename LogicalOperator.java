public class LogicalOperator{
    public static void main(String args[]){
        // && logical AND operator[if one statement is false then output is flase]
        System.out.println((3>2) && (5>0));
        System.out.println((3<2) && (5>0));
        System.out.println((3>2) && (5<0));
        System.out.println((3<2) && (5<0));
        
        // || logical OR operator[if one statement is true then output is true ]
        System.out.println((3>2) || (5>0));
        System.out.println((3<2) || (5>0));
        System.out.println((3>2) || (5<0));
        System.out.println((3<2) || (5<0));
        
        // ! Logical NOT operator[true statement convert to false statement and false convert to true ]
        System.out.println(!(3>2));
        System.out.println(!( 0>5));


    }
}