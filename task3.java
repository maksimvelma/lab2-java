import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмірність матриці n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Заповнюємо матрицю випадковими числами в інтервалі від -n до n
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
            }
        }

        // Виводимо початкову матрицю
        System.out.println("Початкова матриця:");
        printMatrix(matrix);

        // Перебудовуємо матрицю
        rearrangeMatrix(matrix);

        // Виводимо перебудовану матрицю
        System.out.println("Перебудована матриця:");
        printMatrix(matrix);

        scanner.close();
    }

    // Метод для виведення матриці на консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Метод для перебудови матриці
    public static void rearrangeMatrix(int[][] matrix) {
        Arrays.sort(matrix, (a, b) -> sum(a) - sum(b));
    }

    // Метод для обчислення суми елементів в масиві
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
