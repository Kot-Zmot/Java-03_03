public class CreditPaymentService {
    public double calculate(double credit, double percent, double term) {
        double paymentMonth;
        double percentMonth = percent / (100 * 12);
        double months = term * 12;
        paymentMonth = credit * percentMonth * (Math.pow((1 + percentMonth), months) / (Math.pow((1 + percentMonth), months) - 1 ));
        return paymentMonth;
    }
}
