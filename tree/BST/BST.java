public class BST {

    public Node insert(Node node, int data) {

        if(node == null) {
            node = new Node(data);
        }
        else {
            if(node.data > data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    public Node delete(Node node, int data) {
        if(node == null)
            return null;

        if(node.data > data)
            node.left = delete(node.left, data);
        else if(node.data < data)
            node.right = delete(node.right, data);
        else {
            if(node.left == null || node.right == null) {
                Node temp = node.left == null ? node.right : node.left;

                if(temp == null)
                    return null;
                else
                    return temp;
            }
            else {
                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right, successor.data);
                return node;
            }
        }
        return node;
    }

    private Node getSuccessor(Node node) {

        Node result = node.right;

        while (result.left != null)
            result = result.left;

        return result;
    }

    public void print(Node node) {
        if(node != null) {
            System.out.println("Node value is: " + node.data);

            if(node.left != null)
                System.out.println("Left node value is: " + node.left.data);
            else
                System.out.println("Left node is null");

            if(node.right != null)
                System.out.println("Right node value is: " + node.right.data);
            else
                System.out.println("Right node is null");

            System.out.println();

            if(node.left != null)
                print(node.left);

            if(node.right != null)
                print(node.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        BST bst = new BST();
        root = bst.insert(root, 12);
        root = bst.insert(root, 6);
        root = bst.insert(root, 15);
        root = bst.insert(root, 16);
        root = bst.insert(root, 3);
        root = bst.insert(root, 11);
        bst.print(root);

        root = bst.delete(root, 12);
        System.out.println("************** After deletion *************");
        bst.print(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
