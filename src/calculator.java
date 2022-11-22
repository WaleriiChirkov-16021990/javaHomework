import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Перед вами калькулятор.");
        System.out.println("Для работы со мной выберите операцию.");
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        Double num1 ;
        Double num2 ;
        while (true) {
            System.out.println("\n1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление\n5.Выход\n");
            System.out.println("Ваш выбор: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input < 1 && input > 5) {
                    System.out.println("Такого пункта нет!");
                    continue;
                }
                if (input == 5) break;
            } else {
                System.out.println("Вы ввели не число");
            }

            while (true) {
                System.out.println("Введите 1 число: ");
                if (scanner.hasNextDouble()) {
                    num1 = scanner.nextDouble();
                } else {
                    System.out.println("Вы ввели не число.");
                    continue;
                }
                System.out.println("Введите второе число: ");
                if (scanner.hasNextDouble()) {
                    num2 = scanner.nextDouble();
                    if (input ==4) {
                        if (num2 == 0) {
                            System.out.println("На 0 делить нельзя!");
                            continue;
                        }
                    }
                } else {
                    System.out.println("Вы ввели не число.");
                    continue;
                }
                Double result = calc(input, num1, num2);
                System.out.printf("ответ = %s \n", result);
                break;
            }
        }
    }

    private static Double calc(int inp, Double num1, Double num2){
        Double result = 0.0;
    if (inp == 1) {
        result = num1 + num2;
    }
    else if (inp == 2) {
        result = num1 - num2;
    } else if (inp == 3) {
        result = num1 * num2;
    }else if (inp == 4) {
        result = num1 / num2;
    }
        return result;
    }
}
