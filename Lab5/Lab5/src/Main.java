import KI306.Yarmola.Lab5.ExpressionCalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
public static void main(String[] args) throws IOException {

        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
        String line = reader.readLine();
        double x = Double.parseDouble(line);

        ExpressionCalculator calculator = new ExpressionCalculator(x);

        try {
        double result = calculator.calculateExpression();
        calculator.saveResultToFile(result, outputFileName);
        System.out.println("Результат обчислення: " + result);
        } catch (ArithmeticException e) {
        System.err.println("Помилка обчислення: " + e.getMessage());
        } catch (IOException e) {
        System.err.println("Помилка при записі до файлу: " + e.getMessage());
        }
        } catch (IOException e) {
        System.err.println("Помилка при читанні з файлу: " + e.getMessage());
        }
        }
}