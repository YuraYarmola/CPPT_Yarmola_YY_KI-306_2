package KI306.Yarmola.Lab5;

import java.io.*;

public class ExpressionCalculator {
    private double x;

    public ExpressionCalculator(double x) {
        this.x = x;
    }

    public double calculateExpression() throws ArithmeticException {
        double ctgX = 1 / Math.tan(x);
        if (Math.abs(ctgX) < 1e-6) {
            throw new ArithmeticException("Ділення на нуль у виразі.");
        }

        return Math.cos(x) / (x + 2 * ctgX);
    }

    public void saveResultToFile(double result, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Результат обчислення виразу: " + result);
        }
    }

}
