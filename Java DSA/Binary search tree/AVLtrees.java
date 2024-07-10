public class AVLtrees {
    static class Node {
        int data, height;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    static Node root;

    static int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int getBalance(Node node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    static Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else
            return node;

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Left Left (LL) Case
        if (balance > 1 && key < node.left.data)
            return rightRotate(node);

        // Right Right (RR) Case
        if (balance < -1 && key > node.right.data)
            return leftRotate(node);

        // Left Right (LR) Case
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left (RL) Case
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    static void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        /* 
               30     
              /  \    
             20   40  
            /  \    \ 
           10  25   50
        */
        System.out.println("Preorder traversal of the AVL tree is:");
        preOrder(root);
    }
}
