import java.util.LinkedList;

public class LinkedListColl {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        int nums[] = {5,4,3,2,1};
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addFirst(1);
        for(int i=0; i<nums.length; i++){
            ll.addLast(nums[i]);
        }
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.getFirst());
        // remove
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll);
    }
}

