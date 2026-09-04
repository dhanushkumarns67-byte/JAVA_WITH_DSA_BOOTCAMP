package DAY10.SESSION3;

import java.util.*;
public class SortTheStrings {
    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry", "date"};
        String[] sortedArr = sortStrings(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
