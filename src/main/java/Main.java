import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> listOfNames = new LinkedList<>();
        listOfNames.add("John");
        listOfNames.add("Peter");
        listOfNames.add("Martin");
        listOfNames.add("Nella");
        listOfNames.add("Jan");

        System.out.println("Task1 result:");
        Tasks.task1(listOfNames);

        System.out.println("Task2 result:");
        Tasks.task2(listOfNames);

        System.out.println("Task3 result:");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,0,4,5));
        Tasks.task3(numbers);

        System.out.println("Task4 result:");
        Stream<Long> randomNumbers = Tasks.task4(0, 25214903917L, 11L, (long) Math.pow(2, 48));
        randomNumbers.limit(10).forEach(System.out::println);

        Stream<String> streamA = Stream.of("Alpha", "Beta", "Gamma");
        Stream<String> streamB = Stream.of("1","2","3");
        System.out.println("Task5 result:");
        Tasks.zip(streamA,streamB).peek(System.out::println).collect(Collectors.toList());

    }



}
