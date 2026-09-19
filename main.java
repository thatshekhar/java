public class Main {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                    if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Sum of border elements is: " + sum);    
    }
}