public class Main {
    public static void main(String[] args) {
        SalesData subject = new SalesData();

        Observer displayLine = new DisplayLine();
        Observer displayTable = new DisplayTable();

        subject.addObserver(displayLine);
        subject.addObserver(displayTable);

        subject.addMonthSales(new MonthSale("Jan", 50, 1240));
        System.out.println();
        subject.addMonthSales(new MonthSale("Feb", 22, 524));
        System.out.println();
        subject.addMonthSales(new MonthSale("Mar", 80, 2100));
        System.out.println();
        subject.addMonthSales(new MonthSale("Apr", 61, 1912));
        System.out.println();
        subject.addMonthSales(new MonthSale("May", 38, 740));
    }
}