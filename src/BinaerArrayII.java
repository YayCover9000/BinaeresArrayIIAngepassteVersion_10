import java.util.Scanner;

public class BinaerArrayII {

    public static void ausgeben(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Das übergebene Array ist null.");
            return;
        }
        int[] rows = new int[matrix.length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            int zeros = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeros++;
                }
            }
            if (zeros % 2 == 0) {
                rows[count] = i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Keine Zeilen mit einer geraden Anzahl von Nullen gefunden.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print("Zeile " + rows[i] + ": ");
                for (int j = 0; j < matrix[rows[i]].length; j++) {
                    System.out.print(matrix[rows[i]][j] + " ");
                }
                System.out.println();
                /*
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

          */
            }
        }
    }
}