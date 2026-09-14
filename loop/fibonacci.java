package loop;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     int a = 0;
     int b = 1;
     int i = 0;
     while(i <= n)
     {    System.out.print(a + " ");
         int c = a + b;
         a = b;
         b = c;
         i++;
     }
    
        
    }
    
}
