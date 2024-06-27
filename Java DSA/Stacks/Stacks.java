import java.util.ArrayList;
import java.util.Stack;
public  class Stacks {
    static class StackAL{
        static ArrayList<Integer> list= new ArrayList<>();
        public boolean isEmpty(){
            return list.isEmpty();
        }
        // push
        public void push(int data){
            list.add(data);
        }
        // pop
        public int pop(){
            if (isEmpty()) return -1;
            return list.remove(list.size()-1);
        }
        // peek
        public int peek(){
            if (isEmpty()) return -1;
            return list.get(list.size()-1);
        }
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class StackLL{
        static Node head = null;
        public boolean isEmpty(){
            return head == null;
        }
        // push
        public void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        // pop
        public int pop(){
            if (isEmpty()) return -1;
            Node temp = head;
            head = head.next;
            return temp.data;
        }
        // peek
        public int peek(){
            if (isEmpty()) return -1;
            return head.data;
        }

    }
    public static void main(String[] args) {
        StackAL sa = new StackAL();
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.push(4);
        sa.push(5);
        
        while (!sa.isEmpty()) { 
            System.out.println(sa.peek());
            sa.pop();
        }
        StackLL sl = new StackLL();
        sl.push(1);
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) { 
            System.out.println(s.peek());
            s.pop();
        }
    }
}