import java.util.List;

public class DisplayLine implements Observer, Display {
    private List<MonthSale> monthSaleList;
    @Override
    public void display() {
        for (MonthSale monthSale : monthSaleList) {
            System.out.println("Month: " + monthSale.getMonth()
                    + ", Numbers of sales: " + monthSale.getNumberSales()
                    + ", Total sales value: " + String.format("%.2f", monthSale.getTotalSales()));
        }
    }

    @Override
    public void update(List monthSaleList) {
        this.monthSaleList = monthSaleList;
        display();
    }
}
