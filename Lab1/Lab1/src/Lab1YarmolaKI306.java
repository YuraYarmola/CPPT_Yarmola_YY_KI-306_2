import java.io.*;
import java.util.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.io.RandomAccessFile;

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
    public static void main(String[] args) throws IOException {
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

        RandomAccessFile fout = new RandomAccessFile ("MyFile.txt", "rw");

        for (int I = 0; I < nRows; I++)
        {
            for (int K = nRows; K > I; K--) {
                out.print("\t");
                fout.write("\t".getBytes());
            }

            arr[I] = new char[I];
            for (int J = 0; J < I; J++)
            {
                if(J == arr[I].length-1 && arr[I].length % 2 == 0){
                    arr[I][J] = '*';
                }else {
                    arr[I][J] = (char) filler.codePointAt(0);
                }
                out.print(arr[I][J] + "\t");
                fout.write((arr[I][J] + "\t").getBytes());
            }

            out.println();
            fout.write("\n".getBytes());
        }
        fout.close();
        in.close();
        out.close();
    }
}
