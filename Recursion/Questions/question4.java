package Recursion.Questions;

// PRINT WITHOUT DUPLICATES
import java.util.Arrays;

public class question4{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9 ,9, 1};

        System.out.println("Original Array: " + Arrays.toString(array));

        int length = removeDuplicates(array, 0, array.length - 1);

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(array, length)));
    }

    private static int removeDuplicates(int[] array, int startIndex, int endIndex) {
    if(startIndex >= endIndex){
        return endIndex + 1 ;
    }
    for(int i = startIndex + 1; i <= endIndex; i++){
        if(array[startIndex] == array[i]){
            for(int j=i ; j<endIndex;j++){
                array[j] = array[j+1];
            }
            endIndex--;
            i--;
        }
    }
    return removeDuplicates(array,startIndex+1,endIndex);
    }
}


