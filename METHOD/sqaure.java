package METHOD;

import java.util.Scanner;

public class sqaure {
    static int sqaure(int n){
        return n*n;

    }
public static void main(String [] args){
    Scanner input= new Scanner (System.in);
        int n = input.nextInt();
    System.out.print(sqaure(n));
}
    
}
