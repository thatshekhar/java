public class div {
    public static void main(String[] args) {
        int n = 21;
        int i; 
        for ( i = n-1; i >= 1; i--) {
            if (n % i == 0) {
                break;
            }
        }
        System.out.println(i);
    }
    
}

