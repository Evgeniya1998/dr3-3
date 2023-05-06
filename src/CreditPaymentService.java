public class CreditPaymentService {
    public double calculate(double s, double r, double n) {
        double result;
        result = s * ((r / 1200) + ((r / 1200) / (Math.pow((1 + (r / 1200)), n) - 1)));
        // s- Сумма кредита;
        // r - Месячная процентная ставка
        // n- Количество месяцев, на которое вы берете деньги
        return result;

    }
}

