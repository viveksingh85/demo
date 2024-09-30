public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 0, 15, 25, 28, 40 };
        int sum = 0;

        // Calculate the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}
