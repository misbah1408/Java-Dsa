import java.util.*;
public class HM {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // insert O(1)
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("UK", 300);
        hm.put("China", 400);
        hm.put("Japan", 500);
        hm.put("Germany", 600);
        hm.put("France", 700);
        System.out.println(hm);
        // get O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Canada")); // null if not exicts
        // contains O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Canada")); // false if not exicts
        // remove O(1)
        hm.remove("China");
        System.out.println(hm);
        // size
        System.out.println(hm.size());
        // is empty
        System.out.println(hm.isEmpty());
        // clear
        // hm.clear();
        System.out.println(hm.isEmpty());

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key :"+k + ", value :" + hm.get(k));
        }
    }
}