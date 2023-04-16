import java.util.List;

public abstract class Financing {
    protected double financing, interest;
    protected int term;

    public Financing(double financing, double interest, int term) {
        this.financing = financing;
        this.interest = interest;
        this.term = term;
    }

    public final double totalFinancingAmount(){
        List<Double> installments = installmentsCalculation();
        return sumInstallments(installments);
    }

    private double sumInstallments(List<Double> installments) {
        double sum = 0;
        for (Double installment : installments) {
            sum += installment;
        }
        return sum;
    }

    protected abstract List<Double> installmentsCalculation();
}
