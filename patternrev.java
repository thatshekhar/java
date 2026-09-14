public class patternrev {
    public static void main(String[] args) {
        int r = 5;

        for (int i = 1; i <= r; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= r+1 - i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}