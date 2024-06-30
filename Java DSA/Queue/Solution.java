import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static void printNonRepating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> q1 = new LinkedList<>();
        int size = q.size()/2;
        for (int i = 0; i < size; i++) {
            q1.add(q.remove());
        }
        while (!q1.isEmpty()) {    
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
    public static void reversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepating(str);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<10; i++){
            q.add(i+1);
        }
        System.out.println(q);
        interLeave(q);
        System.out.println(q);
        reversal(q);
        System.out.println(q);
        // Deque double ended queue
        Deque<Integer> dq = new LinkedList<>();
        // all operations
        dq.addFirst(4);
        dq.addLast(5);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
}
