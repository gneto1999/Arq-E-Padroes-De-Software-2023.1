import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PreOrderIterator implements Iterator {
    private int position = 0;
    private List<Node> list = new ArrayList<>();

    public PreOrderIterator(BinarySearchTree bst) {
        preOrder(bst.getRoot());
    }

    private void preOrder(Node root) {
        if(root == null) {
            return;
        }

        list.add(root);
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    @Override
    public Node next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }

        return list.get(position++);
    }

    @Override
    public boolean hasNext() {
        if(list.isEmpty()){
            return false;
        }

        if(position > list.size() - 1) {
            return false;
        }

        return true;
    }
}
