import java.util.Scanner;
import java.lang.Math;

public class BinaerArrayIITesttreiber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie n ein: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Keine gültige Eingabe.");
            return;
        }
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        if (n == 0) {
            System.out.println("Das übergebene Array ist null.");
            return;
        } else {
            BinaerArrayII.ausgeben(matrix);
        }
    }
}

