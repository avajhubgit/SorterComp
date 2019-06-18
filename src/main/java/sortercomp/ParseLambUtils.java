package main.java.sortercomp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseLambUtils {
    public static void showFiveRandomNumbers() {
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
    }

    public static void showSquareNumbers() {
        List<Integer> list = Arrays.asList(10, 19, 14, 7, 11, 15, 20, 18);
        List<Integer> list2 = list.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
    }

    public static String flatMapStreamString(String[][] stringData) {
        StringBuilder stringBuilder = new StringBuilder();
        Stream<String> stream = Arrays.stream(stringData)
                .flatMap(x -> Arrays.stream(x));
        stream.forEach(ch -> stringBuilder.append(ch));
        return stringBuilder.toString();
    }

    public static long countEmptyStringInList(List<String> list) {
        return list.stream().filter(p -> p.isEmpty()).count();
    }
}
