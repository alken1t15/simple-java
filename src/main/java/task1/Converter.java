package task1;

public class Converter {
    double rateUSD, rateEUR, rateRUB;

    public Converter(double usd, double eur, double rub) {
        rateUSD = usd;
        rateEUR = eur;
        rateRUB = rub;
    }

    void convert(double tenges, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + tenges / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + tenges / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в рублях: " + tenges / rateRUB);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}