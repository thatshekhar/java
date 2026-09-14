package loop;
import java.util.Scanner;
public class sumof1ton {
    public static void main(String[] args) {
     try ( Scanner input = new Scanner(System.in)) {
       int n = input.nextInt();
       int sum = 0;
       while(n!=0)
       { 
         int digit= n%10;
          sum = sum + digit;
          n = n / 10;
       }
       System.out.println(sum);
    } }
} 