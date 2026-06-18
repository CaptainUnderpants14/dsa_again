package Trees;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.insert(sc);
        System.out.println("\nTree:");
        tree.displayTree();
        sc.close();
    }
}
