
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш вес (в кг): ");
        double weight = scanner.nextDouble();

        System.out.print("Введите ваш рост (в метрах): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Ваш BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Категория: Недостаток веса");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Категория: Норма");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Категория: Избыточный вес");
        } else {
            System.out.println("Категория: Ожирение");
        }
    }
}
