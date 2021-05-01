public class BST {

    public Node insert(Node node, int data) {

        if (node == null) {
            node = new Node(data);
        } else {
            if (node.data > data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    public Node delete(Node node, int data) {
        if (node == null)
            return null;

        if (node.data > data)
            node.left = delete(node.left, data);
        else if (node.data < data)
            node.right = delete(node.right, data);
        else {
            if (node.left == null || node.right == null) {

                return node.left == null ? node.right : node.left;
            } else {
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

    public void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    public int heightOfTree(Node node) {
        if (node == null)
            return 0;
        else {
            int leftHeight = heightOfTree(node.left);
            int rightHeight = heightOfTree(node.right);

            if (leftHeight > rightHeight)
                return leftHeight + 1;
            else
                return rightHeight + 1;
        }
    }

    public void printInLevelOrder(Node node) {
        int height = heightOfTree(node);

        for (int i = 1; i <= height; i++) {
            printGivenLevel(node, i);
        }
    }

    private void printGivenLevel(Node node, int level) {
        if (node == null)
            return;

        if (level == 1)
            System.out.print(node.data + " ");
        else {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }

    public int sizeOfTree(Node node) {
        if (node == null)
            return 0;
        else {
            int leftSize = sizeOfTree(node.left);
            int rightSize = sizeOfTree(node.right);

            return leftSize + rightSize + 1;
        }
    }

    public Node invertTree(Node node) {
        if(node == null)
            return null;
        else {
            Node left = invertTree(node.left);
            Node right = invertTree(node.right);

            node.left = right;
            node.right = left;

            return node;
        }
    }

    public Node search(Node node, int data) {
        if(node == null || node.data == data)
            return node;
        if(node.data > data)
            return search(node.left, data);
        else
            return search(node.right, data);
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

        root = bst.delete(root, 12);

        System.out.println("Inorder: ");
        bst.printInorder(root);
        System.out.println();

        System.out.println("Postorder: ");
        bst.printPostorder(root);
        System.out.println();

        System.out.println("Preorder: ");
        bst.printPreorder(root);
        System.out.println();

        System.out.println("In Level Order: ");
        bst.printInLevelOrder(root);
        System.out.println();

        System.out.println("Size of the tree: " + bst.sizeOfTree(root));

        bst.invertTree(root);

        System.out.println("In Level Order: ");
        bst.printInLevelOrder(root);
        System.out.println();

        Node node = bst.search(root, 5);
        if(node != null)
            System.out.println("Found data: " + node.data);
        else
            System.out.println("Data not found.");


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
