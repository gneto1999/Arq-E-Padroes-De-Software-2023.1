import java.util.List;

public class DisplayTable implements Observer, Display {
    private List<MonthSale> monthSaleList;
    @Override
    public void display() {
        System.out.println(" Month " + "| Numbers of sales |" + " Total sales value");
        for (MonthSale monthSale : monthSaleList) {
            System.out.print("   " + monthSale.getMonth() + " ");
            System.out.print("| \t\t" + monthSale.getNumberSales() + "\t\t  |");
            System.out.print(" " + String.format("%.2f", monthSale.getTotalSales()) + " ");
            System.out.println();
        }
    }

    @Override
    public void update(List monthSaleList) {
        this.monthSaleList = monthSaleList;
        display();
    }
}
