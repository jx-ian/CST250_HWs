package hw7;

public class Node {

    private int value;
    public Node left;
    public Node right;
    
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    public static void print(Node node) {
        //Print the nodes from left to right
        if (node == null) {
            return;
        }
        
        System.out.println(node.value);
        print(node.left);
        print(node.right);
    }
    
    public Node delete (Node node, int value) {
        //return when there no node
        if(node == null) {
            return null;
        }
        
        //Recursive functions to delete node children
        if(value < node.value) {
            node.left = delete(node.left, value);
            return node;
        }
        else if (value > node.value){
            node.right = delete(node.right, value);
            return node;
        }
        
        //When root is the only node then rearrange the tree
        //One child: if left child is deleted then fill in with the right child and if right child is deleted then just left parent
        if (node.left == null) {
            return node.right;
        }
        else if(node.right == null) {
            return node.left;
        }
        else{
            
            //When there are more than one child
            Node successor = node;
            Node ancester = node.right;
            
            //Find the successor of the node 
            while(ancester.left != null) {
                successor = ancester;
                ancester = ancester.left;
            }
            
            //Successor is always the left node
            //We can make ancester to be the parent of the successor node when the successor parent is missing

            if(successor != node) {
                successor.left = ancester.right;
            }
            else {
                successor.right = ancester.right;
            }
            
            //Return the data to the tree
            node.value = ancester.value;
            
            return node;
        }

    }
    
}
