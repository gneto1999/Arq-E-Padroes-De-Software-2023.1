public class BinarySearchTree implements Collection {
    private Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node root, int value) {
        if(root == null) {
            return new Node(value);
        } else {
            if(value < root.getValue()) {
                root.setLeft(insertRecursive(root.getLeft(), value));
            } else {
                root.setRight(insertRecursive(root.getRight(), value));
            }
        }

        return root;
    }

    @Override
    public Iterator createIterator() {
        return new PreOrderIterator(this);
    }

    public Node getRoot() {
        return root;
    }
}
