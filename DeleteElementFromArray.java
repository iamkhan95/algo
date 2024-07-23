
import java.util.Arrays;

public class DeleteElementFromArray {

    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] array = {1, 2, 3, 4, 5};
        int elementToDelete = 3; // Step 2: Specify the element to delete

        // Step 3: Find the index of the element to delete
        int indexToDelete = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToDelete) {
                indexToDelete = i;
                break;
            }
        }

        // Step 4: Delete the element if found
        if (indexToDelete != -1) {
            for (int i = indexToDelete; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            // Step 4: Decrease the size of the array by creating a new array
            array = Arrays.copyOf(array, array.length - 1);
        }

        // Step 5: Print the new array
        System.out.println("Array after deletion: " + Arrays.toString(array));
    }
}
