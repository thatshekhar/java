import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
dir

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        Student s1 = new Student(name, roll, marks);

        System.out.println("\nStudent Details:");
        s1.display();

        sc.close();
    }
}