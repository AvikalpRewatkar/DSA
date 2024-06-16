package Tree;

import java.util.ArrayList;
import java.util.List;
class Node {
    int val;
    Node left = null;
    Node right = null;

    public Node(int data) {
        val = data;
    }
}
public class BinaryTreeYT {
    public static List<Integer> preOrderTraversal(Node rootNode) {
        List<Integer> list = new ArrayList<>();
        preOrderTraversal(rootNode, list);
        return list;
    }
    static void preOrderTraversal(Node rootNode, List<Integer> list) {
        if (rootNode == null)
            return;
        list.add(rootNode.val);
        preOrderTraversal(rootNode.left, list);
        preOrderTraversal(rootNode.right, list);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        List<Integer> result = preOrderTraversal(root);
        for (int val: result) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}