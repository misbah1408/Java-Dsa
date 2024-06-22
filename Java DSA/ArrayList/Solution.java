import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static boolean monotonic(ArrayList<Integer> list) {
        boolean ans = true;
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) >= list.get(i + 1)) && !(list.get(i) >= list.get(i + 1))) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
        // Sort the input list
        Collections.sort(list);

        // Initialize the list to store lonely numbers
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();

        // Handle the special case where the list has only one element
        if (list.size() == 1) {
            lonelyNumbers.add(list.get(0));
            return lonelyNumbers;
        }

        // Check the first element
        if (list.get(0) + 1 < list.get(1)) {
            lonelyNumbers.add(list.get(0));
        }

        // Check the elements from the second to the second-last
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i + 1)) {
                lonelyNumbers.add(list.get(i));
            }
        }

        // Check the last element
        if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
            lonelyNumbers.add(list.get(list.size() - 1));
        }

        return lonelyNumbers;
    }

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        // Initialize an ArrayList to store frequencies
        ArrayList<Integer> res = new ArrayList<>();
        
        // Iterate through the list to count frequencies of numbers following the key
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int nextNum = nums.get(i + 1);
                
                // Ensure the ArrayList can accommodate the index
                while (res.size() <= nextNum) {
                    res.add(0);
                }
                
                res.set(nextNum, res.get(nextNum) + 1);
            }
        }
        
        // Find the number with the highest frequency
        int maxFrequency = Integer.MIN_VALUE;
        int mostFrequentNum = -1;
        
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) > maxFrequency) {
                maxFrequency = res.get(i);
                mostFrequentNum = i;
            }
        }
        
        return mostFrequentNum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(monotonic(list));
        System.out.println(lonely(list));
        System.out.println(mostFrequent(list,2));
    }
}
