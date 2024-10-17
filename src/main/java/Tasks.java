import java.util.*;
import java.util.stream.*;

public class Tasks {
    public static void task1(List<String> listOfNames){
        String result = listOfNames.stream()
                .filter(name->listOfNames.indexOf(name)%2 == 1)
                .map(name->listOfNames.indexOf(name)+". " + name)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    public static void task2(List<String> listOfNames){
        String result = listOfNames.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(",  "));
        System.out.println(result);
    }

    public static void task3(List<Integer> listOfNumbers) {
        String result = listOfNumbers.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }



    public static Stream<Long> task4(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> streamAItems = first.toList();
        List<T> streamBItems = second.toList();

        int minSize = Math.min(streamAItems.size(),streamBItems.size());

        List<T> resultList = new ArrayList<>();

        for(int i = 0; i < minSize; i++) {
            resultList.add(streamAItems.get(i));
            resultList.add(streamBItems.get(i));
        }

        return resultList.stream();
    }


}