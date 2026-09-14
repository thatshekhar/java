package loop;
import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int n = input.nextInt();
            int reverse = 0;

            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            System.out.println(reverse);
        
    }
}