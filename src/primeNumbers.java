/*
Вывести все простые числа от 1 до 1000.
 */

public class primeNumbers {
    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 1 ; i <= 1000; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    flag = false;
                    break;
                }
            } if (flag) {
                System.out.println(i);
            }
        }
    }
}
