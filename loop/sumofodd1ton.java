package loop;
import java.util.Scanner;
public class sumofodd1ton {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            if(i%2!=0){
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }

    
}