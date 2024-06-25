public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }
    // remove
    public int removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            size = 0;
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int  removeLast(){
        if(head == null){
            System.out.println("List is empty");
            size = 0;
            return Integer.MIN_VALUE;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    // print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(30);
        dll.addFirst(20);
        dll.addFirst(10);
        dll.print();
        dll.addLast(40);
        dll.addLast(50);
        dll.addLast(60);
        dll.removeFirst();
        dll.print();
        System.out.println(DoubleLL.size);
        dll.removeLast();
        dll.print();
        System.out.println(DoubleLL.size);
        dll.reverse();
        dll.print();
    }
}
