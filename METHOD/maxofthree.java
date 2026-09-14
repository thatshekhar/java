package METHOD;

import java.util.Scanner;

class maxofthree{
    static int maxofthree(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c && b>a){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(maxofthree(a,b,c));
    }
}