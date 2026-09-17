package array;
import java.util.Scanner;

public class marksui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter array elements");

        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Array elements are");
        for(int i=0; i<marks.length; i++){
            System.out.println (marks[i]);
        }
    
    }
}

