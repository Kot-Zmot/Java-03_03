public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // Сумма кредита, руб
        double credit = 1000000;
        // Процентная ставка, %
        double percent = 9.99;
        // Срок кредитования, лет
        double term = 1;

        double payment = service.calculate(credit, percent, term);
        // Приведение дроби
        int result = (int) payment;

        System.out.println(" Ежемесячный плаже составит " + result + " руб.");
    }
}
