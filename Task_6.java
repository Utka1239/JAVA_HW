import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите число и я скажу палиндром ли это: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(palindrom(str));
    }

    public static boolean palindrom(String msg) {
        StringBuilder reverse = new StringBuilder();
        String str = msg.replaceAll("\\s+", "").toLowerCase(); //Приводим к нижнему регистру и убираем пробелы
        char[] phrase = str.toCharArray();
        for (int i = phrase.length - 1; i >= 0; i--) {
            reverse.append(phrase[i]);
        }
        return (reverse.toString()).equals(str); //Проверка на одинаковость
    } 
}
