public class Basics {
    public static void change(int[] arr, int idx, int val) {
        if (idx == arr.length) {
            print(arr);
            return;
        }
        arr[idx] = val;
        change(arr, idx + 1, val + 1);
        arr[idx] = arr[idx] - 2; // backtracking step
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findSubset(String str, String ans, int i) {
        if (i == str.length()) {
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //Yes choice
        findSubset(str, ans + str.charAt(i), i + 1);
        //No choice
        findSubset(str, ans, i+1);
    }
    //Timr complexity O(n*2^n)
    public static void findSubset(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans.toString());
            }
            return;
        }
        // Yes choice
        ans.append(str.charAt(i));
        findSubset(str, ans, i + 1);
        ans.deleteCharAt(ans.length() - 1); // backtrack
        // No choice
        findSubset(str, ans, i + 1);
    }
    //Time complexity O(n*n!)
    public static void strPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            strPermutation(newStr, ans + ch);
        }
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // change(arr, 0, 1);
        // print(arr);
        String str = "abc";
        // findSubset(str, "", 0);
        // findSubset(str, new StringBuilder(""), 0);
        strPermutation(str, "");
    }
}
