import java.util.ArrayList;
import java.util.List;

public class SalesData implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    private List<MonthSale> monthSaleList = new ArrayList<>();

    public void addMonthSales(MonthSale monthSale) {
        monthSaleList.add(monthSale);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(monthSaleList);
        }
    }
}
