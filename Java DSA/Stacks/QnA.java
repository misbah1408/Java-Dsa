
import java.util.*;

public class QnA {
    public static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        int n = stocks.length;
        for (int i = 1; i < n; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && stocks[s.peek()] <= currPrice) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    public static void nextGreater(int[] arr, int[] nextGreater) {
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else {
                    char top = s.peek();
                    if (ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '[') {
                        s.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }

    static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    static void maxArea(int[] nums) {
        int maxArea = 0;
        int nsr[] = new int[nums.length];
        int nsl[] = new int[nums.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = nums.length; // No smaller element to the right
            } else {
                nsr[i] = s.peek(); // Smaller element to the right
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // No smaller element to the left
            } else {
                nsl[i] = s.peek(); // Smaller element to the left
            }
            s.push(i);
        }

        // Print results
        for (int i : nsr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : nsl) {
            System.out.print(i + " ");
        }
        System.out.println();
        // current area : width = j-i-1 = nsr[i] -nsl[i] -1
        for(int i=0;i<nums.length; i++){
            int width = nsr[i] - nsl[i] - 1;
            int area = width * nums[i];
            maxArea = Math.max(maxArea, area);
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i : span) {
            System.out.print(i + " ");
        }
        System.out.println();
        int arr[] = { 1, 2, 3, 4, 3 };
        int nextGreater[] = new int[arr.length];
        nextGreater(arr, nextGreater);
        for (int i : nextGreater) {
            System.out.print(i + " ");
        }
        // valid parantheses
        String str = "({})[])";
        System.out.println(isValid(str));
        // duplicate parantheses
        String str1 = "(((a+b)+(c+d)))";
        System.out.println(isDuplicate(str1));
        int nums[] = { 2, 1,5,6,2,3 };
        maxArea(nums);
    }
}
