package loop;
import java.util.Scanner;
public class digitcount {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
     int n= input.nextInt();
     int count=0;
     while(n!=0)
         {   
         n=n/10;
         count++; 
        } 
         System.out.println("count" + count);
    
           
    }
}

