import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Questions {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // static class BinaryTree {
    // static int idx = -1;

    // public Node buildTree(int[] nodes) {
    // idx++;
    // if (nodes[idx] == -1) {
    // return null;
    // }
    // Node newNode = new Node(nodes[idx]);
    // newNode.left = buildTree(nodes);
    // newNode.right = buildTree(nodes);
    // return newNode;
    // }
    // }

    static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.data != subRoot.data) {
            return false;
        }
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    static void topView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Info> q = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>(); // map to store the nodes at each horizontal distance

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();
            // System.out.println(curr.hd + " " + curr.node.data);
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
            }
        }
        for (Node node : map.values()) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }

    static void bottomView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Info> q = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>(); // map to store the nodes at each horizontal distance

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();
            // System.out.println(curr.hd + " " + curr.node.data);
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            } else {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
            }
        }
        for (Node node : map.values()) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }

    static void kthLevel(Node root, int level, int k) {
        if (root == null)
            return;
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }

    static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;

        path.add(root);
        if (root.data == n)
            return true;
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if (foundLeft || foundRight)
            return true;
        path.remove(path.size() - 1);
        return false;
    }

    static Node lca(Node root, int n1, int n2) { // O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i))
                break;
        }
        return path1.get(i - 1);
    }

    static Node lca2(Node root, int n1, int n2) { // O(n)
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }

    static int lcaDist(Node root, int n) {
        if (root == null)
            return -1;
        if (root.data == n) {
            return 0;
        }

        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);
        if (left == -1 && right == -1) {
            return -1;
        } else if (left == -1) {
            return right + 1;
        }
        return left + 1;
    }

    static int minDis(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dis1 = lcaDist(lca, n1);
        int dis2 = lcaDist(lca, n2);

        return dis1 + dis2;
    }

    static int kthAncestor(Node root, int n, int k) {
        if (root == null)
            return -1;
        if (root.data == n)
            return 0;

        int left = kthAncestor(root.left, n, k);
        int right = kthAncestor(root.right, n, k);
        if (left == -1 && right == -1) {
            return -1;
        }
        int max = Math.max(left, right);
        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;
    }

    static int sumTree(Node root) {
        // Base case: if the node is null, return 0
        if (root == null) {
            return 0;
        }

        // Recursively sum the values of the left and right subtrees
        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);

        int currentValue = root.data;

        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;
        root.data = leftData + leftSum + rightData + rightSum;

        return currentValue;
    }

    // preorder
    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        // tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // subTree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubTree(root, subRoot)); // true
        topView(root);
        bottomView(root);

        // kth level elements
        int level = 1, k = 1;
        kthLevel(root, level, k);
        System.out.println();
        // lowest common ancestor
        int n1 = 5, n2 = 6;
        System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root, n1, n2).data);
        // minimum distance
        System.out.println(minDis(root, n1, n2));
        System.out.println();
        // kth ancestor
        kthAncestor(root, n1, k);
        // transform to sum tree
        sumTree(root);
        preOrder(root);
    }
}
