import java.util.Scanner;

public class even {
    static boolean even(int n){
    
            return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int n = input.nextInt();
        System.out.println(even(n));
    }
}