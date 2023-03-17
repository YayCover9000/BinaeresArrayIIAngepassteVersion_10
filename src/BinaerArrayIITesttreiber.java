import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

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

        System.out.println("Matrix:");
        BinaerArrayII.ausgeben(matrix);
    }
    public static int einlesen() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie die Größe des Arrays ein:");
            int n = scanner.nextInt();
            return n;
        }

        public static int[][] initialisieren(int n) {
            int[][] array = new int[n][n];
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = random.nextInt(2);
                }
            }
            return array;
        }
    }

