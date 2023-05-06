public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double s; //Сумма кредита
        double r; // Месячная процентная ставка
        double n; // Количество месяцев, на которое вы берете деньги


        System.out.println("Аннуитетные платежи:");
        System.out.println((int)(service.calculate(1_000_000, 9.99, 12)));
        System.out.println((int) (service.calculate(1_000_000, 9.99, 24)));
        System.out.println((int) (service.calculate(1_000_000, 9.99, 36)));
    }
}