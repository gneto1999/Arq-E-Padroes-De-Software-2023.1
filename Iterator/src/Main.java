public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        bst.insert(45);
        bst.insert(10);
        bst.insert(90);
        bst.insert(7);
        bst.insert(50);
        bst.insert(12);
        
        Iterator iterator = bst.createIterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next().getValue() + " ");
        }
    }
}