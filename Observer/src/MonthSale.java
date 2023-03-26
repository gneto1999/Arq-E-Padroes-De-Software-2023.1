public class MonthSale {
    private String month;
    private int numberSales;
    private double totalSales;

    public MonthSale(String month, int numberSales, double totalSales) {
        this.month = month;
        this.numberSales = numberSales;
        this.totalSales = totalSales;
    }

    public String getMonth() {
        return month;
    }

    public int getNumberSales() {
        return numberSales;
    }

    public double getTotalSales() {
        return totalSales;
    }
}
