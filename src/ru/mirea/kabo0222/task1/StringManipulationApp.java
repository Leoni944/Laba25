package ru.mirea.kabo0222.task1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.println("Введите регулярное выражение:");
        String regex = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        System.out.println("Найденные элементы:");
        while (matcher.find()) {
            String element = matcher.group();
            System.out.println(element);
        }

        scanner.close();
    }
}
