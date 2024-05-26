package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
//            this.left = null;
//            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // preorder root-> left -> right
        void preorder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // inorder left-> root-> right
        void inorder(Node root) {
            if (root == null) return;
            preorder(root.left);
            System.out.print(root.data + " ");
            preorder(root.right);
        }

        // postorder left-> right-> root
        void postorder(Node root) {
            if (root == null) return;
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data + " ");
        }

        /* level-order traversal using queue.   (BFS)
         * isme a queue banega jisame
         * 1. first queue m rootNode jayegi
         * 2. then usake leftNode and rightNode
         * 3. rootNode queue se bahar aake print hoga usake bad
         * 4. lefNode queue se bahar aayega and usake left and rightNode queue m enter karenge
         * 5. rightNode queue se bahar aayega and usake left and rightNode queue m enter karenge
         */
        void levelOrder(Node root) {     //
            if (root == null) return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()) {  // Do not use == .
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (!queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }

        // Q.->  Count Of Nodes.
        int count(Node root) {
            if (root == null) return 0;
            int leftCount = count(root.left);
            int rightCount = count(root.right);
            return leftCount + rightCount + 1;
        }

        // Sum Of Nodes.
        int sumOfNodes(Node root) {
            if (root == null) return 0;
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        // Height of a tree.( root to deepest leaf)
        int height(Node root) {
            if (root == null) return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int myHeight = Math.max(leftHeight, rightHeight) + 1;
            return myHeight;
        }

        // Diameter Of a tree.(number of nodes in the longest path between any two nodes).
        int diameter(Node root) {
            if (root == null) return 0;
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;
            return Math.max(diam3, Math.max(leftDiameter, rightDiameter));
        }

        TreeInfo diameter2(Node root) {
            if (root == null) return new TreeInfo(0, 0);
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
            int myHeight = Math.max(left.ht, right.ht) + 1;
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;
            int myDiam = Math.max(Math.max(diam1, diam2), diam3);

            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;
        }

        // Optimal approach for diameter.
        static class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

        // check subTree of a tree.

    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("root.data = " + root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
//        tree.levelOrder(root);
//        System.out.println("tree.count(root) = " + tree.count(root));
//        System.out.println("tree.sumOfNodes(root) = " + tree.sumOfNodes(root));
//        System.out.println("tree.height(root) = " + tree.height(root));
//        System.out.printf(" ", tree.diameter(root));
//        System.out.println("\ntree.diameter(root) = " + tree.diameter(root));

        System.out.println("tree.diameter2(root) = " + tree.diameter2(root).diam);
    }
}
