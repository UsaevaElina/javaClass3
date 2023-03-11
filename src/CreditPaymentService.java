public class CreditPaymentService {
    public int calculate(int creditSum, int creditPeriod, double interestRate){
        double P = interestRate / 100 / 12;
        double monthlyСoef = P + (P / (Math.pow((1 + P), creditPeriod * 12) - 1) );

        double monthlyPayment = creditSum * monthlyСoef;

        return (int)monthlyPayment;

    }

}
