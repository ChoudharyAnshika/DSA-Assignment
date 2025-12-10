public class Q11_FirstLastOccurrence {

    static int findFirst(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    static int findLast(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 6};
        int x = 2;

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("First occurrence of " + x + ": " + findFirst(arr, x));
        System.out.println("Last occurrence of " + x + ": " + findLast(arr, x));
    }
}