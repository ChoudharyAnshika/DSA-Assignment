class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Q23_BinarySearchTree {
    BSTNode root;

    Q23_BinarySearchTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    BSTNode insertRec(BSTNode root, int data) {
        if (root == null) {
            return new BSTNode(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    boolean search(int data) {
        return searchRec(root, data);
    }

    boolean searchRec(BSTNode root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        if (data < root.data) return searchRec(root.left, data);
        return searchRec(root.right, data);
    }

    void delete(int data) {
        root = deleteRec(root, data);
    }

    BSTNode deleteRec(BSTNode root, int data) {
        if (root == null) return null;

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            BSTNode minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteRec(root.right, minNode.data);
        }
        return root;
    }

    BSTNode findMin(BSTNode root) {
        while (root.left != null) root = root.left;
        return root;
    }

    void inorder() {
        System.out.print("BST Inorder: ");
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Q23_BinarySearchTree bst = new Q23_BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 100: " + bst.search(100));

        bst.inorder();

        bst.delete(30);
        System.out.println("After deleting 30:");
        bst.inorder();
    }
}