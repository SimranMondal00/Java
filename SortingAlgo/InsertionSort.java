package SortingAlgo;

public class InsertionSort {
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11}; // Example input array
            System.out.println("Original array:");
            printArray(arr);

            // Sort the array using insertion sort
            insertionSort(arr);

            System.out.println("Sorted array:");
            printArray(arr);
        }

        // Function to perform insertion sort
        public static void insertionSort(int[] arr) {
            int n = arr.length;

            // Traverse through all array elements
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;

                // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
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


