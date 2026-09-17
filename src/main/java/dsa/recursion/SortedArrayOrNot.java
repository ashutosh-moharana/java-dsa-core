package dsa.recursion;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5, 6};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }

    public static boolean helper(int[] arr, int idx) {
        if (idx == arr.length - 1) return true;

        return (arr[idx] < arr[idx + 1]) && helper(arr, idx + 1);
    }
}
