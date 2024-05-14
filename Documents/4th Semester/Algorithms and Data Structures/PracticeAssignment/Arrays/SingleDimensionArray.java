package Arrays;


/**
 * 1. insert  into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well as the whole array)
 * 4. Search for an element in an array
 */
import java.util.Arrays;

public class SingleDimensionArray {
    int arr[] = null;

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
                System.out.println("This cell is already occupied with another value");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" + e);
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("Array no longer exists" + e);
        }
    }

    public void accessCell(int cellNumber) {
        try {
            System.out.println(arr[cellNumber]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" + e);
        }
    }

    public void searchInArray(int valueToSearch) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == valueToSearch) {
                    System.out.println("Value found at index: " + i);
                    return;
                }
            }
            System.out.println("Value not found in array");

        } catch (Exception e) {
            System.out.println("Array no longer exists!!" + e);
        }
    }

    public void deleteValueFromArray(int valueToDelete) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == valueToDelete) {
                    arr[i] = Integer.MIN_VALUE;
                    System.out.println("Value " + valueToDelete + " deleted successfully");
                    return;
                }
            }
            System.out.println("Value not found in array");

        } catch (Exception e) {
            System.out.println("Array no longer exists!!" + e);
        }
    }

    public static void main(String[] args) {
        // create the object of the class
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(3, 4);
        singleDimensionArray.insert(4, 5);
        singleDimensionArray.insert(5, 3);
        singleDimensionArray.insert(6, 4);
        singleDimensionArray.insert(7, 5);

        System.out.println("Array after insertion:");
        singleDimensionArray.traverseArray();

        System.out.println("\nValue at index 3:");
        singleDimensionArray.accessCell(3);

        System.out.println("\nSearch for value 3:");
        singleDimensionArray.searchInArray(3);

        System.out.println("\nDelete value 3 from array:");
        singleDimensionArray.deleteValueFromArray(3);

        System.out.println("\nArray after deletion:");
        singleDimensionArray.traverseArray();
    }
}
