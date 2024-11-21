public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    private Node deleteRec(Node root, int data) {

        if (root == null) {
            return root;
        }


        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {

            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {

                root.data = minValue(root.right);


                root.right = deleteRec(root.right, root.data);
            }
        }
        return root;
    }
    public void delete(int data) {
        root = deleteRec(root, data);
    }
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
    public void inOrder() {
        inOrderRec(root);
    }
}
