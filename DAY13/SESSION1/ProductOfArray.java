package DAY13.SESSION1;

public class ProductOfArray {
    public static int[] productOfArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int prefix = 1, suffix = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productOfArray(arr);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
