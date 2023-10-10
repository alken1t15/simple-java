package task2;


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter(444.06, 489.32, 4.88);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager(); // Здесь создайте объект класса ExpensesManager

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();
        boolean repeat = true;
        while (repeat) {
            printMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> {
                    System.out.printf("Ваши сбережения: %f KZT" +
                            "\n В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - RUB.", moneyBeforeSalary);
                    int currency = scanner.nextInt();
                    converter.convert(moneyBeforeSalary, currency); // Вызовите метод класса Converter
                }
                case 2 -> dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
                case 3 -> moneyBeforeSalary = expensesManager.saveExpense(scanner, moneyBeforeSalary);
                case 4 -> expensesManager.printAllExpenses();
                case 5 ->
                        System.out.printf("Самая большая сумма расходов на этой неделе составила %s тенге", expensesManager.findMaxExpense());
                case 0 -> {
                    System.out.println("Выход");
                    repeat = false;
                }
                default -> System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.print("""
                Что вы хотите сделать?\s
                1 - Конвертировать\s
                2 - Получить совет
                3 - Ввести трату\s
                4 - Показать траты за неделю\s
                5 - Показать самую большую сумму расходов за неделю\s
                0 - Выход""");
    }
}