package SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; // Example input array
        System.out.println("Original array:");
        printArray(arr);

        // Sort the array using selection sort
        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Function to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
