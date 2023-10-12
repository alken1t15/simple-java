package task2;

public class Converter {
    private final double rateUSD, rateEUR, rateRUB;

    public Converter(double usd, double eur, double rub) {
        rateUSD = usd;
        rateEUR = eur;
        rateRUB = rub;
    }

    public void convert(double tenges, int currency) {
        switch (currency) {
            case 1 -> System.out.println("Ваши сбережения в долларах: " + tenges / rateUSD);
            case 2 -> System.out.println("Ваши сбережения в евро: " + tenges / rateEUR);
            case 3 -> System.out.println("Ваши сбережения в рублях: " + tenges / rateRUB);
            default -> System.out.println("Неизвестная валюта");
        }
    }
}