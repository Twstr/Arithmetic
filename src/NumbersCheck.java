import java.util.Scanner;

public class NumbersCheck {

    public static void isPositive(int number) {
        if (number >= 0) {
            System.out.println("The " + number + " is positive");
        } else {
            System.out.println("The " + number + " is negative");
        }
    }

    public static void isSiple(int number) {
        for (int i = 1; i < number ; i++) {
            if(number % 1 == 0) {
                System.out.println("Не простое");
                break;
            } else {
                System.out.println("Простое");
            }
        }
    }

    public static void isDivider(int number) {
        if(number % 2 == 0 && number % 3 == 0 && number % 5 == 0 && number % 6 == 0 && number % 9 == 0) {
            System.out.println("Число делится на 2, 3, 5, 6, 9");
        } else {
            System.out.println("Число не делится на 2, 3, 5, 6, 9");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки на позитивный/негативный: ");
        int userInput = sc.nextInt();
        isPositive(userInput);
        System.out.println("Введите число для проверки простое ли оно: ");
        userInput = sc.nextInt();
        isSiple(userInput);
        System.out.println("Введите число для проверки делится ли оно на 2, 3, 5, 6, 9: ");
        userInput = sc.nextInt();
        isDivider(userInput);

    }
}
