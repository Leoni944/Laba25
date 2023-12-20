package ru.mirea.kabo0222.task2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 100 RUB, 12.5 EUR. Неправильные выражения: 44 ERR, 0.004 EU.";

        String usdRegex = "\\d+(\\.\\d+)? USD";
        String rubRegex = "\\d+(\\.\\d+)? RUB";
        String eurRegex = "\\d+(\\.\\d+)? EUR";

        Pattern usdPattern = Pattern.compile(usdRegex);
        Pattern rubPattern = Pattern.compile(rubRegex);
        Pattern eurPattern = Pattern.compile(eurRegex);

        Matcher usdMatcher = usdPattern.matcher(text);
        Matcher rubMatcher = rubPattern.matcher(text);
        Matcher eurMatcher = eurPattern.matcher(text);

        System.out.println("Цены в USD:");
        while (usdMatcher.find()) {
            System.out.println(usdMatcher.group());
        }

        System.out.println("\nЦены в RUB:");
        while (rubMatcher.find()) {
            System.out.println(rubMatcher.group());
        }

        System.out.println("\nЦены в EUR:");
        while (eurMatcher.find()) {
            System.out.println(eurMatcher.group());
        }
    }
}
