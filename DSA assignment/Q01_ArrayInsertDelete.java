public class Q01_ArrayInsertDelete {

    static int[] insertElement(int[] arr, int element, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = element;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index!");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        displayArray(arr);

        arr = insertElement(arr, 25, 2);
        System.out.println("After inserting 25 at index 2:");
        displayArray(arr);

        arr = deleteElement(arr, 3);
        System.out.println("After deleting element at index 3:");
        displayArray(arr);
    }
}