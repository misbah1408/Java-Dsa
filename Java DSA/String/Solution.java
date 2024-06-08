import java.util.*;

public class Solution {
    public static int sol1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static boolean sol2(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            char strArr1[] = str1.toCharArray();
            char strArr2[] = str2.toCharArray();
            Arrays.sort(strArr1);
            Arrays.sort(strArr2);
            if(Arrays.equals(strArr1, strArr2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.err.println("Vowels = " + sol1(str));
        sc.close();
        System.out.println(sol2("heart", "ewnui"));
    }
}
