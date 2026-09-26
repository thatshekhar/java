public class Missing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6;

        int total = n * (n + 1) / 2;
        int Sum = 0;

        for (int num : arr) {
            Sum += num;
        }

        int missing = total - Sum;

        System.out.println("Missing number: " + missing);
    }
}