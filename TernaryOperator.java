public class TernaryOperator {
    public static void main(String args[]){
        int number = 55;
        String larger= ((number%2)==0)? "even" : "odd";

        System.out.println(larger);
    }
}
