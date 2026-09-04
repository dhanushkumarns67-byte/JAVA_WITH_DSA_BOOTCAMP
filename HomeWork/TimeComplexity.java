package HomeWork;

public class TimeComplexity {

    // Linear Search
    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            // Best case:
            // Target is found at the first position
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int target = 10;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

