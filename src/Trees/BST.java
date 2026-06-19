package Trees;

public class BST{
    public class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    Node root;

    //initializing insertion of elements with root node
    public void insert(int value){
        root = insert(root, value);
    }

    //Recursive insertion
    public Node insert(Node node, int value){

        if (node == null){
            return new Node(value);
        }

        if (value < node.value){
            node.left = insert(node.left, value);
        }else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    //initializing printing with root node
    public void printTree() {
        printTree(root, 0);
    }

    //recursive priting of element
    private void printTree(Node node, int level) {
        if (node == null) {
            return;
        }
        printTree(node.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.value);
        printTree(node.left, level + 1);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        bst.printTree();
    }
}
