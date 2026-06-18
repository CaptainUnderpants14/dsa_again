package Trees;

import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }
}

public class BinaryTree {

    public Node root;

    //to insert elements
    public void insert(Scanner sc){
        System.out.print("Enter root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,  root);
    }

    public void populate(Scanner sc, Node node){
        System.out.print("Do you want to insert left of " + node.value + ": ");
        boolean left = sc.nextBoolean();
        if (left){
            System.out.print("Enter the value of left of " + node.value + ": ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.print("Do you want to insert right of " + node.value + ": ");
        boolean right = sc.nextBoolean();
        if (right){
            System.out.print("Enter the value of right of " + node.value + ": ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void displayTree() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value);

        if (node.left != null) {
            System.out.print(" " + node.left.value + "L");
        }

        if (node.right != null) {
            System.out.print(" " + node.right.value + "R");
        }

        System.out.println();

        display(node.left);
        display(node.right);
    }
}
