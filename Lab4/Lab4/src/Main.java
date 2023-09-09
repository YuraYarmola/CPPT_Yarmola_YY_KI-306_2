import KI306.Yarmola.Lab4.ExpressionCalculator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Головний клас програми для обчислення виразу та збереження результату у файл.
 *
 * @author Yurii Yarmola
 * @since 1.0
 */
public class Main {
    /**
     * Точка входу в програму.
     *
     * @param args Масив аргументів командного рядка.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        ExpressionCalculator calculator = new ExpressionCalculator(x);

        try {
            double result = calculator.calculateExpression();
            calculator.saveResultToFile(result);
            System.out.println("Результат обчислення: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Помилка обчислення: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка при записі до файлу: " + e.getMessage());
        }
    }
}
