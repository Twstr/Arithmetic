import java.util.Scanner;

public class Arithmetic {

    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    static int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    static int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int firstInput = sc.nextInt();
        System.out.println("Введите 2 число");
        int secondInput = sc.nextInt();
        System.out.println("Введите знак операции - +, - , *, /");
        String operation = sc.next();

        switch (operation) {
            case ("+"): {
                System.out.println(add(firstInput, secondInput));
                break;
            }
            case ("-"): {
                System.out.println(sub(firstInput, secondInput));
                break;
            }
            case ("*"): {
                System.out.println(mul(firstInput, secondInput));
                break;
            }
            case ("/"): {
                if (secondInput == 0) {
                    System.out.println("Делитель не должен быть " + secondInput);
                    break;
                } else {
                    System.out.println(div(firstInput, secondInput));
                    break;
                }
            }
            default: {
                System.out.println("Вы ввели неправильный знак операции");
            }
        }

    }
}
