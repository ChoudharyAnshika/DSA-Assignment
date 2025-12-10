public class Q04_MaxMinArray {

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {45, 23, 78, 12, 56, 89, 34};
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Maximum: " + findMax(arr));
        System.out.println("Minimum: " + findMin(arr));
    }
}