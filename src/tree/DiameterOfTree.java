package tree;

public class DiameterOfTree {
    int height;
    int diameter;
    DiameterOfTree(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }

//    DiameterOfTree diameter2(Node root) {
//    }

    public static void main(String[] args) {

    }
}
