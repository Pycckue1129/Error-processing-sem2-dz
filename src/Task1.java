import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float number = Input();
        System.out.println("Введенное число: " + number);
    }

    public static float Input() {
        System.out.print("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextFloat()) {
            return scanner.nextFloat();
        } else {
            System.out.println("Неправильный ввод!");
            return Input();
        }
    }
}