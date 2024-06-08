package Tree;

public class PreorderOwnApproach {

    public static void main(String[] args) {
        PreorderOwnApproach bt = new PreorderOwnApproach();
        Node root = bt.createBT();
        bt.preorder(root);System.out.println();
        // bt.postorder(root);System.out.println();
        // bt.inorder(root);System.out.println();
    }
    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    Node createBT() {
        // create each nodes of tree
        Node root = new Node(7);
        Node p1 = new Node(4);
        Node p2 = new Node(9);
        Node p3 = new Node(2);
        Node p4 = new Node(6);
        Node p5 = new Node(8);
        Node p6 = new Node(10);
        Node p7 = new Node(1);
        Node p8 = new Node(3);
        Node p9 = new Node(5);

        // linking each node
        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        p2.left = p5;
        p2.right = p6;
        p3.left = p7;
        p3.right = p8;
        p4.left = p9;

        return root;
    }    
}
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}