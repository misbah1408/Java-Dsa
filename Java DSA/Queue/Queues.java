import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Queues {
    static class QueueArr{
        static int[] arr;
        static int front, rear, size;
        QueueArr(int size){
            arr = new int[size];
            front = rear = -1;
            QueueArr.size = size;
        }

        public boolean isEmpty(){
            return rear == -1;
        }
        public boolean isFull(){
            return (rear+1)%size == front;
        }
        // add
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear++;
            arr[rear] = data;   
        }
        // remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            // int data = arr[0];
            // for(int i = 0; i < rear; i++){
            //     arr[i] = arr[i + 1];
            // }
            // rear--;
            // return data;
            int data = arr[front];
            arr[front] = 0;
            if(rear == front){
                rear = -1;
            }else{
                front = (front+1)%size;
            }
            return data;
        }

        // peek
        public int peek(){
            if(rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
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
    static class QueueLL{
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty(){
            return head == null;
        }

        // add
        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public int remove(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }
            Node temp = head;
            head = head.next;
            return temp.data;
        }

        // peek
        public int peek(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    
    static class QueueStk{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }
        // add
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        // remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return s1.pop();
        }
        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    static class QueueStks {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
    
        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    
        // Add an element to the stack
        public void add(int data) {
            // Always add to the empty queue
            if (q1.isEmpty()) {
                q1.add(data);
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            } else {
                q2.add(data);
                while (!q1.isEmpty()) {
                    q2.add(q1.remove());
                }
            }
        }
    
        // Remove the top element from the stack
        public int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            // Remove from the non-empty queue
            return q1.isEmpty() ? q2.remove() : q1.remove();
        }
    
        // Peek at the top element of the stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            // Peek from the non-empty queue
            return q1.isEmpty() ? q2.peek() : q1.peek();
        }
    }
    public static void main(String[] args) {
        QueueArr q1 = new QueueArr(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
        QueueLL q2 = new QueueLL();
        q2.add(1);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        QueueStk q3 = new QueueStk();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        while(!q3.isEmpty()){
            System.out.println(q3.peek());
            q3.remove();
        }
        QueueStks q4 = new QueueStks();
        q4.add(1);
        q4.add(2);
        q4.add(3);
        q4.add(4);
        while(!q4.isEmpty()){
            System.out.println(q4.peek());
            q4.remove();
        }
    }
}