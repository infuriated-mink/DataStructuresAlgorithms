package arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int[] arr;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array: " + e);
        }
    }

    // Method to traverse and print all elements of the array
    public void traverseArray() {
        try {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("Array is null.");
        }
    }

    // Method to delete an element from the array by setting it to Integer.MIN_VALUE
    public void delete(int location) {
        try {
            arr[location] = Integer.MIN_VALUE;
            System.out.println("Value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array: " + e);
        }
    }

    // Method to delete all elements in the array
    public void deleteAll() {
        Arrays.fill(arr, Integer.MIN_VALUE);
        System.out.println("All values have been deleted successfully");
    }

    // Method to search for an element in the array
    public void search(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value found at index: " + i);
                return;
            }
        }
        System.out.println("Value not found in array");
    }

    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(10);

        // Inserting values
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(3, 4);
        singleDimensionArray.insert(4, 5);
        singleDimensionArray.insert(5, 3);
        singleDimensionArray.insert(6, 4);
        singleDimensionArray.insert(7, 5);
        System.out.println("Initial Array: " + Arrays.toString(singleDimensionArray.arr));
        System.out.print("Traversing Array: ");
        singleDimensionArray.traverseArray();

        // Deleting a value
        singleDimensionArray.delete(3);
        System.out.println("Array after deleting value at index 3: " + Arrays.toString(singleDimensionArray.arr));

        // Searching for a value
        singleDimensionArray.search(4);

        // Deleting all values
        singleDimensionArray.deleteAll();
        System.out.println("Array after deleting all values: " + Arrays.toString(singleDimensionArray.arr));

        // Attempting to traverse an empty array
        System.out.print("Attempting to traverse an empty array: ");
        singleDimensionArray.traverseArray();

        // Trying to delete from an empty array
        singleDimensionArray.delete(1);

        // Searching in an empty array
        singleDimensionArray.search(1);
    }
}