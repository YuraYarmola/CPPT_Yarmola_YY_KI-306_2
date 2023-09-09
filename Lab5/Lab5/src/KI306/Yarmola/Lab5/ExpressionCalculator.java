package KI306.Yarmola.Lab5;

import java.io.*;
/**
 * Клас для обчислення виразу та збереження результату у файл.
 */
public class ExpressionCalculator {
    private double x;

    /**
     * Конструктор класу.
     *
     * @param x Значення x, яке буде використовуватися для обчислення виразу.
     */
    public ExpressionCalculator(double x) {
        this.x = x;
    }

    /**
     * Метод для обчислення виразу.
     *
     * @return Результат обчислення виразу.
     * @throws ArithmeticException Виникає, якщо виникає ділення на нуль у виразі.
     */
    public double calculateExpression() throws ArithmeticException {
        double ctgX = 1 / Math.tan(x);
        if (Math.abs(ctgX) < 1e-6) {
            throw new ArithmeticException("Ділення на нуль у виразі.");
        }

        return Math.cos(x) / (x + 2 * ctgX);
    }

    /**
     * Метод для збереження результату обчислення у файл у текстовому і двійковому форматах.
     *
     * @param result      Результат обчислення виразу.
     * @param textFile    Ім'я файлу для текстового формату.
     * @param binaryFile  Ім'я файлу для двійкового формату.
     * @throws IOException Виникає, якщо сталася помилка при записі у файл.
     */
    public void saveResultToFile(double result, String textFile, String binaryFile) throws IOException {
        // Запис у текстовий файл
        try (PrintWriter textWriter = new PrintWriter(new FileWriter(textFile))) {
            textWriter.println("Результат обчислення виразу: " + result);
        }

        // Запис у двійковий файл
        try (DataOutputStream binaryWriter = new DataOutputStream(new FileOutputStream(binaryFile))) {
            binaryWriter.writeDouble(result);
        }
    }
}
