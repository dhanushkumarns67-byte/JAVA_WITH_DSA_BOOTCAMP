package HomeWork;

public class JaggedArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4, 5};
        arr[2] = new int[]{6, 7, 8, 9};

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}