import java.util.ArrayList;
import java.util.List;

public class Box implements ProductComponent {
    private List<ProductComponent> childs = new ArrayList<>();
    @Override
    public void add(ProductComponent productComponent) {
        childs.add(productComponent);
    }

    @Override
    public void print() {
        for (ProductComponent child : childs) {
            child.print();
        }
    }

    @Override
    public void remove(ProductComponent productComponent) {
        childs.remove(productComponent);
    }

    @Override
    public double total() {
        double sum = 0.0;
        for (ProductComponent child : childs) {
            sum += child.total();
        }
        return sum;
    }
}
