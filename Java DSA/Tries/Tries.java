public class Tries {
    static class Node {
        Node[] children = new Node[26];
        boolean isEndOfWord = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    static void insert(String word) { // O(L)
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children[ch - 'a'] == null) {
                curr.children[ch - 'a'] = new Node();
            }
            curr = curr.children[ch - 'a'];
        }
        curr.isEndOfWord = true;
    }

    // search
    static boolean search(String word) { //O(L)
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children[ch - 'a'] == null) {
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return curr.isEndOfWord;
    }
    static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=0; i<=key.length(); i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] words = { "i", "like", "sam", "samsung", "mobile"};
        for (String word : words) {
            insert(word);
        }
        System.out.println(search("samsung"));

        // word break problem
        String key = "ilikesamsun";
        System.out.println(wordBreak(key));
    }
}