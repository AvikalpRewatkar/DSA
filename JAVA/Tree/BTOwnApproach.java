package Tree;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTOwnApproach {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        BTOwnApproach bt = new BTOwnApproach();
        Node root = bt.createBT();
        // bt.preorder(root);System.out.println();
        // bt.postorder(root);System.out.println();
        // bt.inorder(root);System.out.println();
        // bt.levelOrderPrint(root);
        // bt.levelOrderList(root);
        System.out.println(bt.countInternalNodesInTree(root));

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

    //Height of Tree
    int heightTree(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = heightTree(root.left);
        int rh = heightTree(root.right);

        return 1 + Math.max(lh, rh);
    }

    //Total no. of nodes in tree
    int countInternalNodesInTree(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int countl = countInternalNodesInTree(root.left);
        int countr = countInternalNodesInTree(root.right);

        return countl + countr;
    }

    // PreOrder of Tree with rootNode given
    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // PostOrder of Tree with rootNode given
    void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // InOrder of Tree with rootNode given
    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // LevelOrder of Tree with rootNode given
    void levelOrderList(Node root) {
        List<List<Integer>> level = new ArrayList<>();
        level = levelOrderTraversal(root);

        for (List<Integer> lev : level) {
            for (int num : lev) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    List<List<Integer>> levelOrderTraversal(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> inList = new ArrayList<>();
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.remove();
                inList.add(curr.data);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            list.add(inList);
        }
        return list;
    }

    void levelOrderPrint(Node root) {
        // List<List<Integer>> l = new ArrayList<>();
        if (root == null) {
            // return l;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            // List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = q.remove();
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            System.out.println();
        }

        // return l;
    }
}