import java.io.*;
import java.util.*;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Клас Lab1YarmolaKI306 реалізує виведення масиву згідно з завданням варіанту №10
 * @author Yurii Yarmola
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab1YarmolaKI306 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args - arguments in main function
     * @throws FileNotFoundException - File not found
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(System.out, true, UTF_8);
        out.println("Введіть розмір квадратної матриці: ");
        Scanner in = new Scanner(System.in);
        int nRows = in.nextInt();
        out.println("Введіть символ-заповнювач: ");
        in.nextLine();
        String filler = in.nextLine();
        if (filler.length() != 1)
        {
            out.print("\nСимвол-заповнювач введено невірно.");
            System.exit(0);
        }
        char[][] arr = new char[nRows][];

        PrintWriter fout = new PrintWriter ("MyFile.txt");

        for (int I = 0; I < nRows; I++)
        {
            for (int K = nRows; K > I; K--) {
                out.print("\t");
                fout.write("\t");
            }

            arr[I] = new char[I];
            for (int J = 0; J < I; J++)
            {
                arr[I][J] = (char)filler.codePointAt(0);
                out.print(arr[I][J] + "\t");
                fout.write(arr[I][J] + "\t");
            }
            out.println();
            fout.println();
        }
        fout.close();
        in.close();
        out.close();
    }
}
