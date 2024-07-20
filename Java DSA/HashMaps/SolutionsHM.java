import java.util.HashMap;
import java.util.HashSet;

public class SolutionsHM {
    static void maojorityEle(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // if(map.containsKey(arr[i])){
            // map.put(arr[i], map.get(arr[i])+1);
            // }else{
            // map.put(arr[i], 1);
            // }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }

    static boolean validAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    static int countDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int arr1 : arr) {
            set.add(arr1);
        }
        return set.size();
    }

    static HashSet<Integer> union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set;
    }

    static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }
        return count;
    }

    static String itinery(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        // System.out.println(revMap);
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return "";
    }

    static int largestSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                len = Math.max(len, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return len;
    }

    static int subarraySum(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        maojorityEle(arr);
        // valid anagram
        String s = "anagram", t = "nagaram";
        System.out.println(validAnagram(s, t));
        // count distinct elements
        int[] arr1 = { 4, 3, 2, 5, 6, 7, 4, 3, 2, 1 };
        System.out.println(countDistinct(arr1));

        // union
        int[] arr2 = { 7, 3, 9 };
        int[] arr3 = { 6, 3, 9, 2, 9, 4 };
        System.out.println(union(arr2, arr3));
        // intersection
        System.out.println(intersection(arr2, arr3));

        // itinery from tickets
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Delhi", "Goa");
        tickets.put("Goa", "Chennai");
        String start = itinery(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
        // largest subarray with 0 sum
        int[] arr4 = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(largestSubarray(arr4));
        // subarray sum equal to k
        int[] arr5 = { 10, 2, -2, -20, 10 };
        int k = -10;
        System.out.println(subarraySum(arr5, k));
    }
}
