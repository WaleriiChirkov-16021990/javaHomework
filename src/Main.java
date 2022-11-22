/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n), \n
n! (произведение чисел от 1 до n)
 */


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = "";
        int number = 0;
        int result = 0;
        int result2 = 0;
        while (true) {
            System.out.printf("Введите число: ");
            num = scanner.nextLine();
            try {
                if (isNumeric(num)){
                    number = Integer.parseInt(num);
                    if( number > 0){
                        break;
                    } else {
                        throw new IOException();
                    }
                } else {
                    throw new IOException();
                }
            } catch (IOException e){
                System.out.println(e.getMessage());
                System.out.println("Введите положительное целое число.");
            }
        }
        result = factorial(number);
        System.out.printf("Факториал числа %d = %d .\n",number, result);
        result2 = rectangle(number);
        System.out.printf("%d-e треугольное число = %d .\n",number, result2);
        scanner.close();
    }

    private static int factorial(int num){
        int factor = 1;
        if (num == 1 || num == 0){
            return factor;
        }
        factor = num * factorial(num -1);
        return factor;
    }


    private static int rectangle (int num){
        int rectan = 1;
        if (num == 1 || num == 0){
            return rectan;
        }
        rectan = num + rectangle(num -1);
        return rectan;
    }
    private static boolean isNumeric(String str){
        return str.matches("\\d$");
    }
}