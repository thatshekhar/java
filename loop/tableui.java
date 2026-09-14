
package loop;
import java.util.Scanner;
public class tableui {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int i = 1;
       while(i<=10){
           System.out.println(n+"x"+i+"="+n*i);
           i++;
       }
    }
}