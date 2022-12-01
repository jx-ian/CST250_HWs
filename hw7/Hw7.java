package hw7;

/**
 * @author jiahaoxian
 */

public class Hw7 {

    public static void main(String[] args) {
        
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);
        
        Node.print(root);
        root.delete(root, 3);
        System.out.println();
        Node.print(root);
    }

}
