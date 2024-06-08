import java.util.*;

//Time complexity O(n)
public class QnA {
    public static boolean isPalisdrome(String str) {
        // String rev;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    static public String subString(String str, int si, int ei) {
        String sub = "";
        for (int i = si; i < ei; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    // Time complexity O(n)
    public static String toUpperCase(String str) {
        StringBuffer sb = new StringBuffer("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(" ").append(Character.toUpperCase(str.charAt(i + 1)));
                i++;
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    //Time complexity O(n)
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print( "Enter a string : ");
        // String str = sc.nextLine();
        // String res = isPalisdrome(str) ? ""+str + " is Palindrome" : ""+str + " not a
        // Palindrome";
        // System.out.println(res);
        sc.close();
        // String path = "NESW";
        // float dis = getShortestPath(path);
        // System.out.println(dis);
        // String str = "HelloWorld";
        // System.out.println(subString(str, 0, 5));
        // String fruits[] = {"apple", "mango", "banana"};
        // String largest = fruits[0];
        // //Time complexity O(x*n)
        // for(int i=0; i<fruits.length; i++){
        // if(largest.compareToIgnoreCase(fruits[i]) < 0 ){
        // largest = fruits[i];
        // }
        // }
        // System.out.println(largest);
        // StringBuilder sb = new StringBuilder("");
        // //Time complexity O(n)
        // for(char ch='a'; ch<='z'; ch++){
        // sb.append(ch + " ");
        // }
        // System.out.println(sb);
        // String str = "Hello world";
        // System.out.println(toUpperCase(str));

        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
