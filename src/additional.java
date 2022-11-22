/*
Задано уравнение вида q + w = e, где q, w, e >= 0.\n
 Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. \n
 Требуется восстановить выражение до верного равенства. \n
 Предложить хотя бы одно решение или сообщить, что его нет.
*/


public class additional {
    public static void main(String[] args) {
        System.out.println("Имеем уравнение вида 'q + w = e'");
        System.out.println("Предположим уравнение имеет следующий вид '2? + ?5 = 69'\nи решим его.");
        String str = "2? + ?5 = 69";
        String[] array = new String[2];
        array = str.split("[\\+\\-\\=]");
        System.out.println(String.join(",", array));
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replace("?","").replace(" ", "");
            }
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[1]);
        int sum = Integer.parseInt(array[2]);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < (sum-num1-num2)/10; j++) {
                if (num1*10+i + j*10+num2 == sum){
                    System.out.printf("2 %s + %s 5 = 69", i, j);
                }
            }
        }
    }
}
