import java.util.ArrayList;
import java.util.List;

public class SAC extends Financing {
    private List<Double> installmentsList = new ArrayList<>();
    private double balance;

    public SAC(double financing, double interest, int term) {
        super(financing, interest, term);
    }

    @Override
    public List<Double> installmentsCalculation() {
        balance = financing;
        double monthlyAmortization = financing/term;
        for(int i = 0; i < term; i++) {
            double installmentValue = monthlyAmortization + interest * (balance - (monthlyAmortization * i));
            installmentsList.add(installmentValue);
        }
        return installmentsList;
    }
}
