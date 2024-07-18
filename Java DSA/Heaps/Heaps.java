import java.util.ArrayList;
import java.util.PriorityQueue;

public class Heaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(logn)
            arr.add(data);
            int x = arr.size() - 1;
            int p = (x - 1) / 2;
            while (arr.get(x) > arr.get(p)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(p));
                arr.set(p, temp);
                x = p;
                p = (x - 1) / 2;
            }
        }

        public int peek() { // O(1)
            return arr.get(0);
        }

        // heapify
        public void heapify(int i) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int min = i;
            if (l < arr.size() && arr.get(l) > arr.get(min)) {
                min = l;
            }
            if (r < arr.size() && arr.get(r) > arr.get(min)) {
                min = r;
            }
            if (min != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);
                heapify(min);
            }
        }

        // remove
        public int remove() { // O(logn)
            int x = arr.size() - 1;
            // step 1 swap
            int temp = arr.get(0);
            arr.set(0, arr.get(x));
            arr.set(x, temp);
            // step 2 remove last
            arr.remove(x);
            // step 3 heapify
            heapify(0);
            return temp;
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }

    static void heapify(int[] arr, int i, int n) { //O(nlogn)
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int maxIdx = i;
        if (l < n && arr[l] > arr[maxIdx]) {
            maxIdx = l;
        }
        if (r < n && arr[r] > arr[maxIdx]) {
            maxIdx = r;
        }
        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, n);
        }
    }

    static void heapSort(int[] arr) {
        int n = arr.length;
        // step 1 build heap
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }
        // step 2 push largest at end
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    static class Point implements Comparable<Point>{
        int x, y;
        int disSq;
        int idx;
        public Point(int x, int y, int disSq, int idx){
            this.x = x;
            this.y = y;
            this.disSq = disSq;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point p2) {
            return this.disSq - p2.disSq;
        }
    }
    static  class Row implements Comparable<Row>{
        int soldier, idx;
        public Row(int soldier, int idx){
            this.soldier = soldier;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2) {
            if(this.soldier == r2.soldier){
                return this.idx - r2.idx;
            }else{
                return this.soldier - r2.soldier;
            }
        }
    }
    static class Pair implements Comparable<Pair>{
        int val, idx;
        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(3);
        h.add(4);
        while (!h.isEmpty()) {
            System.out.println(h.remove());
        }
        System.out.println();
        int arr[] = { 1, 2, 4, 5, 3 };
        heapSort(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }

        int[][] pts = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int x = pts[i][0];
            int y = pts[i][1];
            int disSq = x*x + y*y;
            pq.add(new Point(x,y,disSq, i));
        }

        // nearest k 
        for(int i = 0; i < k; i++){
            System.out.println("C"+ pq.remove().idx);
        }

        // connect n ropes
        int[] ropes = { 4,2,3,6};
        int n = ropes.length;
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq2.add(ropes[i]);
        }
        int sum = 0;
        while(pq2.size() > 1){
            int min1 = pq2.remove();
            int min2 = pq2.remove();
            int c = min1 + min2;
            sum += c;
            pq2.add(c);
        }
        System.out.println("Sum = " + sum);
        // weakest soldier
        int[][] army = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int n1 = army.length;
        int k1 = 2;
        PriorityQueue<Row> pq3 = new PriorityQueue<>();
        for(int i=0; i<n1; i++){
            int count = 0;
            for(int j=0; j<army[i].length; j++){
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq3.add(new Row(count, i));
        }
        for(int i=0; i<k1; i++){
            System.out.println("Row " + pq3.remove().idx);
        }
        // sliding window
        int[] arr1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k2 = 3;
        int[] res = new int[arr1.length - k2 + 1]; // n - k + 1
        PriorityQueue<Pair> pqp = new PriorityQueue<>();

        // 1st window
        for (int i = 0; i < k2; i++) {
            pqp.add(new Pair(arr1[i], i));
        }
        res[0] = pqp.peek().val;

        for (int i = k2; i < arr1.length; i++) {
            while (!pqp.isEmpty() && pqp.peek().idx <= (i - k2)) {
                pqp.remove();
            }
            pqp.add(new Pair(arr1[i], i));
            res[i - k2 + 1] = pqp.peek().val;
        }

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}

// basics
// public class Heaps {
// static class Student implements Comparable<Student>{
// String name;
// int rank;

// public Student(String name, int rank){
// this.name = name;
// this.rank = rank;
// }
// @Override
// public int compareTo(Student s){
// return this.rank - s.rank;
// }
// }
// public static void main(String[] args) {
// PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
// pq.add(new Student("A", 15));
// pq.add(new Student("B", 11));
// pq.add(new Student("C", 12));
// while(!pq.isEmpty()){
// System.out.println(pq.peek().name + " -> " + pq.remove().rank);
// }
// }
// }