import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        }
        if (root.data > val) {
            // insert in left
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            // insert in right
            root.right = insert(root.right, val);
        }
        return root;
    }

    static void inOrder(Node root) { // O(n)
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static boolean search(Node root, int key) { // O(H) -> H is height of tree
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (root.data > key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    static int findInOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    static Node deleteNode(Node root, int val) {
        if (root == null)
            return null;
        if (root.data > val)
            root.left = deleteNode(root.left, val);
        else if (root.data < val)
            root.right = deleteNode(root.right, val);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = findInOrderSuccessor(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    static void printInRange(Node root, int k1, int k2) {
        if (root == null)
            return;
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    static void rootToLeafPath(Node root, ArrayList<Integer> paths) {
        if (root == null) {
            return;
        }
        paths.add(root.data);
        if (root.left == null && root.right == null) {
            for (int i : paths) {
                System.out.print(i + " ->");
            }
            System.out.println("null");
        }
        rootToLeafPath(root.left, paths);
        rootToLeafPath(root.right, paths);
        paths.remove(paths.size() - 1);
    }

    static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    static Node mirror(Node root) {
        if (root == null)
            return null;
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    static void preOrder(Node root) { // O(n)
        if (root == null) {
            // System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static Node createBalBST(int[] arr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = si + (ei - si) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBalBST(arr, si, mid - 1);
        root.right = createBalBST(arr, mid + 1, ei);
        return root;
    }

    static void getInorderList(Node root, ArrayList<Integer> res) {
        if (root == null)
            return;
        getInorderList(root.left, res);
        res.add(root.data);
        getInorderList(root.right, res);
    }

    static Node createBalBstAL(ArrayList<Integer> res, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = si + (ei - si) / 2;
        Node root = new Node(res.get(mid));
        root.left = createBalBstAL(res, si, mid - 1);
        root.right = createBalBstAL(res, mid + 1, ei);
        return root;
    }

    static Node convertBstToBlancedBst(Node root) {
        if (root == null) {
            return null;
        }
        // sorted sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorderList(root, inorder);
        // System.out.println(inorder);
        // sorted inorder -> balanced BST
        return createBalBstAL(inorder, 0, inorder.size() - 1);
    }

    static class Info {
        boolean isBst;
        int min;
        int max;
        int size;

        public Info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxBst = 0;

    static Info largestBst(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info left = largestBst(root.left);
        Info right = largestBst(root.right);
        int size = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (root.data <= left.max || root.data >= right.min) {
            return new Info(false, size, min, max);
        }

        if (left.isBst && right.isBst) {
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    static Node createBstAL(ArrayList<Integer> res, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = si + (ei - si) / 2;
        Node root = new Node(res.get(mid));
        root.left = createBstAL(res, si, mid - 1);
        root.right = createBstAL(res, mid + 1, ei);
        return root;
    }
    static Node mergeBSTs(Node root1, Node root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        // step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        // step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);
        // step 3
        int i = 0, j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }
        // step 4
        return createBstAL(finalArr, 0, finalArr.size() - 1);
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 6, 10, 11 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        // search in BST
        System.out.println(search(root, 11));
        // delete a Node in BST
        System.out.println(deleteNode(root, 5));
        // inOrder(root);
        // print in range
        System.out.println();
        printInRange(root,5,14);
        rootToLeafPath(root, new ArrayList<>());
        // valid bst
        System.out.println(isValidBST(root, null, null));
        // mirror BST
        preOrder(root);
        mirror(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        // sorted BST
        int[] arr = { 3, 5, 6, 8, 10, 11, 12 };
        Node root2 = createBalBST(arr, 0, arr.length - 1);
        inOrder(root2);
        System.out.println();
        preOrder(root2);
        System.out.println();
        // convert BST to balanced BST
        Node root3 = new Node(8);
        root3.left = new Node(6);
        root3.left.left = new Node(5);
        root3.left.left.left = new Node(3);
        root3.right = new Node(10);
        root3.right.right = new Node(11);
        root3.right.right.right = new Node(12);
        System.out.println();
        preOrder(convertBstToBlancedBst(root3));

        // largest BST
        Node root4 = new Node(50);
        root4.left = new Node(30);
        root4.left.left = new Node(5);
        root4.left.right = new Node(20);

        root4.right = new Node(60);
        root4.right.left = new Node(45);
        root4.right.right = new Node(70);
        root4.right.right.left = new Node(65);
        root4.right.right.right = new Node(80);
        largestBst(root4);
        System.out.println();
        System.out.println("Largest bst size = " + maxBst);
        // merge to bst and create balanced bst
        Node root5 = new Node(2);
        root5.left = new Node(1);
        root5.right = new Node(4);

        Node root6 = new Node(9);
        root6.left = new Node(3);
        root6.right = new Node(12);
        Node resRoot = mergeBSTs(root5, root6); //O(n)
        preOrder(resRoot);
    }
}
