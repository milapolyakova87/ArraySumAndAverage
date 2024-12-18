import java.math.BigInteger;
import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger[] numbers = new BigInteger[10]; // Используем BigInteger для хранения чисел
        BigInteger sum = BigInteger.ZERO; // Переменная для хранения суммы чисел

        System.out.println("Введите 10 целых чисел:");

        // Запрашиваем числа у пользователя
        for (int i = 0; i < numbers.length; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Число " + (i + 1) + ": ");
                    String input = scanner.next(); // Считываем строку
                    numbers[i] = new BigInteger(input); // Преобразуем строку в BigInteger
                    sum = sum.add(numbers[i]); // Добавляем число к сумме
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: вы ввели не число. Пожалуйста, введите целое число.");
                }
            }
        }

        // Вычисляем среднее значение
        double average = sum.doubleValue() / numbers.length;

        // Выводим результаты
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Среднее значение: " + average);

        scanner.close();
    }
}