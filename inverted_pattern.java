public class inverted_pattern {
    public static void main(String[] args) {
        int n = 7;
        for(int lines = 1; lines<=n; lines++){
            for(int star=1; star <=(n-lines)+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
