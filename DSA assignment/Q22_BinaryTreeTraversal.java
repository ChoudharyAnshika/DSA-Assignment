class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Q22_BinaryTreeTraversal {
    TreeNode root;

    Q22_BinaryTreeTraversal() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inorder() {
        System.out.print("Inorder (Left-Root-Right): ");
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        System.out.print("Preorder (Root-Left-Right): ");
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        System.out.print("Postorder (Left-Right-Root): ");
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(TreeNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Q22_BinaryTreeTraversal tree = new Q22_BinaryTreeTraversal();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
        tree.preorder();
        tree.postorder();
    }
}