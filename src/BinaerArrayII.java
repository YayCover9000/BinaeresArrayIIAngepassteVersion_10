import java.util.Scanner;

public class BinaerArrayII {

    public static void ausgeben(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            int zeros = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeros++;
                }
            }
            if (zeros % 2 == 0) {
                System.out.print("Zeile " + i + ": ");
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Keine Zeilen mit einer geraden Anzahl von Nullen gefunden.");
        }
    }
}