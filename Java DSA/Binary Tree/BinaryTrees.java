import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // preorder
        public void preOrder(Node root) { // O(n)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // inorder
        public void inOrder(Node root) { // O(n)
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // postorder
        public void postOrder(Node root) { // O(n)
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        // level order
        public void levelOrder(Node root) { // O(n)
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.remove();
                if (temp == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                }
            }
        }
        // height of tree
        public int height(Node root) { // O(n)
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(height(root.left), height(root.right));
        }
        // count of nodes
        public int count(Node root) { // O(n)
            if (root == null) {
                return 0;
            }
            return 1 + count(root.left) + count(root.right);
        }
        // sum of nodes
        public int sum(Node root){
            if(root == null) return 0;
            return root.data + sum(root.left) + sum(root.right);
        }
        // diameter of tree
        public int diameter2(Node root) { // O(n^2)
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int leftDiameter = diameter2(root.left);
            int rightDiameter = diameter2(root.right);
            int self = leftHeight + rightHeight +1;
            return Math.max(self, Math.max(rightDiameter, leftDiameter));
        }
        static class Info{
            int height;
            int diameter;
            Info(int h, int d){
                height = h;
                diameter = d;
            }
        }
        public Info diameter(Node root){ //O(n)
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int d = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
            int h = Math.max(leftInfo.height , rightInfo.height) + 1;
            return new Info(h, d);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.print("Pre Order : ");
        tree.preOrder(root);
        System.out.println();
        System.out.print("In Order : ");
        tree.inOrder(root);
        System.out.println();
        System.out.print("Post Order : ");
        tree.postOrder(root);
        System.out.println();
        System.out.println("Level Order : ");
        tree.levelOrder(root);
        System.out.println(tree.height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
        System.out.println(tree.diameter2(root));
        System.out.println(tree.diameter(root).diameter);
    }
}