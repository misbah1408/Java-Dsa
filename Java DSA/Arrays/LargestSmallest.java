// import java.util.*;
public class LargestSmallest {
    public static int LargestNum(int arr[]) {
        int largest = Integer.MIN_VALUE;// -infinity
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int SmallestNum(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 3, 5 };
        int largest = LargestNum(arr);
        int smallest = SmallestNum(arr);
        System.out.println("Largest among array is " + largest);
        System.out.println("Smallest among array is " + smallest);
    }
}
