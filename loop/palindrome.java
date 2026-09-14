package loop;
import java.util.Scanner;
public class palindrome {
 public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int i = n;
      int rev = 0;
       while(n!=0)
       {
         int digit = n%10;
         rev = rev*10 + digit;
         n = n/10;
        }
       if(i==rev)
       {
         System.out.println("palindrome");
        }
    else
       {
            System.out.println("not palindrome");
        }
    }

}
    
