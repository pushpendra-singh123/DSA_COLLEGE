package tree.bst;
import java.util.ArrayList;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
        }
    }
    static Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        else if(root.data > data){
            //left subTree
            root.left = insert(root.left, data);
        }
        else{
            root.right = insert(root.right, data);
        }
        return root;
    }
    static void preorder(Node root){
        if (root == null) return;
        System.out.print(root.data+" ");
        inorder(root.left);
        inorder(root.right);
    }
    static void inorder(Node root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void postrder(Node root){
        if (root == null) return;
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data+" ");
    }
    // Search in bst.
    static Boolean search(Node root,int key){
        if (root == null){
            return false;
        }
        else if (root.data > key){
            return search(root.left, key);
        }
        else if (root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }

    /* Delete a Node.
     * we delete node as parent node
     * 1. No child ( leaf node ) --> delete node and return null to parent
     * 2. one child     --> delete node and replace with child node.
     * 3. Two children  --> delete node for inorder successor.  replace with inorder successor.
     * inorder successor--> in BST left most node in right subtree.
     */
    static Node delete(Node root, int key){
//        if (root == null) return;
        // first search key in the BST.
        if (root.data > key){
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        }
//        else if (root.data != key) {
//            System.out.println("key not found");
//            return null;
//        }
        else{
            // Case 1
            if (root.left == null && root.right == null) return null;
            // Case 2
            else if (root.right == null) return root.left;
            else if (root.left == null) return root.right;
            // Case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }



    static Node inorderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    static void printInRange(Node root, int X, int Y){
        if (root.data >= X && root.data <= Y){
            printInRange(root.left,X,Y);
            System.out.print(root.data + " ");
            printInRange(root.right,X,Y);
        } else if (root.data >= Y) {
            printInRange(root.left, X,Y);
        }
        else {
            printInRange(root.right,X,Y);
        }
    }

    // root to leaf path traversing with the help of array-list
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if (root == null) return;
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }else { // for non leaf nodes
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int[] values = {8,5,3,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }

        inorder(root);
//        Scanner sc = new Scanner(System.in);
//        int key = sc.nextInt();
//        if (search(root, key)){
//            System.out.println("Found");
//        }
//        else System.out.println("Not Found");
        System.out.println();
//        delete(root, 10);
//        inorder(root);
//        printInRange(root,4,11);
        printRootToLeaf(root,new ArrayList<>());
    }
}