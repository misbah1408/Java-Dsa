public class UniqueSubstring {
    static  class Node{
        Node[] children = new Node[26];
        boolean eow;

        public Node(){
            for(int i =0; i<26; i++){
                children[i] = null;            
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        int level;
        int len = word.length();
        int idx;

        Node curr = root;

        for(level =0; level<len; level++){
            idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){
        int level;
        int len = key.length();
        int idx;

        Node curr = root;
        for(level =0; level<len; level++){
            idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow ==true;

    }

    static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count =0;

        for(int i =0; i<26; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }

        return count+1;
    }
    public static String ans = "";

    static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) { // for lexicographically smaller element
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // backtracking
            }

        }
    }
    public static void main(String args[]){
        String str = "ababa"; // ans =10;
        // String str = "apple"; //ans = 15

        //suffix -> trie
        for(int i =0; i<str.length(); i++){
           String curr =  str.substring(i);
           insert(curr);
        }

        System.out.println(countNodes(root));
        String words[] = { "all", "banana", "app", "appl", "ap", "apply", "apple" };

        for (String word : words) {
            insert(word);
        }
        longestWord(root, new StringBuilder(" "));
        System.out.println(ans);

    }
}