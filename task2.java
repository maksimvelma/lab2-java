import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.print("Введіть число від 1 до 12: ");
            if (scanner.hasNextInt()) {
                monthNumber = scanner.nextInt();
                if (monthNumber >= 1 && monthNumber <= 12) {
                    break; // Введене число коректне, виходимо з циклу
                } else {
                    System.out.println("Введене число не входить в діапазон від 1 до 12. Спробуйте ще раз.");
                }
            } else {
                System.out.println("Введене значення не є числом. Спробуйте ще раз.");
                scanner.next(); // Очистити буфер введення
            }
        }

        // Масив з назвами місяців
        String[] months = {
                "Січень", "Лютий", "Березень", "Квітень",
                "Травень", "Червень", "Липень", "Серпень",
                "Вересень", "Жовтень", "Листопад", "Грудень"
        };

        // Вивести назву місяця
        System.out.println("Місяць: " + months[monthNumber - 1]);

        scanner.close();
    }
}
