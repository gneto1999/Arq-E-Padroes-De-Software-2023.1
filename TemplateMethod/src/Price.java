import java.util.ArrayList;
import java.util.List;

public class Price extends Financing {
    private List<Double> installmentsList = new ArrayList<>();
    public Price(double financing, double interest, int term) {
        super(financing, interest, term);
    }

    @Override
    protected List<Double> installmentsCalculation() {
        for(int i = 0; i < term; i++) {
            double installmentValue = (financing * interest)/(1 - Math.pow((1 + interest), -term));
            installmentsList.add(installmentValue);
        }
        return installmentsList;
    }
}
