public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();


        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);


        System.out.println("In-order traversal of the BST before deletion:");
        bst.inOrder();
        System.out.println();


        System.out.println("Deleting node 20:");
        bst.delete(20);
        bst.inOrder();
        System.out.println();

        System.out.println("Deleting node 30:");
        bst.delete(30);
        bst.inOrder();
        System.out.println();

        System.out.println("Deleting node 50:");
        bst.delete(50);
        bst.inOrder();
        System.out.println();

        System.out.println("Deleting node 70:");
        bst.delete(70);
        bst.inOrder();
        System.out.println();
    }
}