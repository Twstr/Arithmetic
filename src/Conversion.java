import java.util.Scanner;

public class Conversion {

    public static double converter (double amount, double rate) {
        return amount * rate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колиичество денег");
        double amount = sc.nextDouble();
        System.out.println("Введите курс");
        double rate = sc.nextDouble();

        System.out.println(converter(amount, rate));
    }
}
