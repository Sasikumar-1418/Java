package array.index;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArray {

    public static void main(String[] args) {

        // Step 1: Array
        Integer[] arr = {1, 2, 3};
        System.out.println("Original Array → " + Arrays.toString(arr));

        // Step 2: Convert Array → ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Converted to ArrayList → " + list);

        // Step 3: Convert ArrayList → Array
        Integer[] newArr = list.toArray(new Integer[0]);
        System.out.println("Converted back to Array → " + Arrays.toString(newArr));
    }
}
