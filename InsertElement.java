
import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 4, 5};
        int elementToInsert = 3;
        int position = 2; // Insert element at index 2

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        int[] newArray = insertElement(originalArray, elementToInsert, position);
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }

    public static int[] insertElement(int[] array, int element, int position) {
        // Create a new array with one more element than the original array
        int[] newArray = new int[array.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element at the specified position
        newArray[position] = element;

        // Copy the remaining elements from the original array to the new array
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }
}
