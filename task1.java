import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість чисел (n): ");
        int n = scanner.nextInt();

        int firstPalindrome = -1; // Перше знайдене число-паліндром
        int secondPalindrome = -1; // Друге знайдене число-паліндром

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть число #" + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                if (firstPalindrome == -1) {
                    firstPalindrome = number;
                } else if (secondPalindrome == -1) {
                    secondPalindrome = number;
                    break; // Зупиняємось, якщо знайдено друге число-паліндром
                }
            }
        }

        if (secondPalindrome == -1) {
            System.out.println("Другого числа-паліндрома не знайдено.");
        } else {
            System.out.println("Друге число-паліндром: " + secondPalindrome);
        }

        scanner.close();
    }

    // Метод для перевірки, чи число є паліндромом
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
