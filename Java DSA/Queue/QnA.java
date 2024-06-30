import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QnA {
    public static void decimalToBinary(int n) {
        int binary = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            binary += rem * (int) Math.pow(10, pow);
            pow++;
            n = n / 2;
        }
        System.out.print(binary + " ");
    }

    public static void printBinary(int n) {
        // Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            decimalToBinary(i);
        }
    }

    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    static int minCost(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first + second);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        printBinary(n);
        generatePrintBinary(n);
        int arr[] = {4,3,2,6};
        int m = 4;
        System.out.println(minCost(arr, m));
    }
}
