public class CreditPaymentService {
    public double calculate(double amountOfCredit, double monthlyInterestRate, double numberOfMonths) {
        double result;
        result = amountOfCredit * ((monthlyInterestRate / 1200) + ((monthlyInterestRate / 1200) / (Math.pow((1 + (monthlyInterestRate / 1200)), numberOfMonths) - 1)));
        // amountOfCredit - Сумма кредита;
        // monthlyInterestRate - Месячная процентная ставка
        // numberOfMonths - Количество месяцев, на которое вы берете деньги
        return result;

    }
}

