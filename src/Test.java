import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test{
    public static void main(String... args){
        Stream<Integer> streamInteger = Stream.iterate(1, n -> n+1);
        Stream<Integer> newStream = streamInteger.skip(5).limit(5);
        newStream.forEach(System.out::println);
        Stream<String> streamString = Stream.of("monkey","gorilla","bonobo");
        Stream<Integer> numStream = streamString.map(String::length);
        numStream.forEach(System.out::println);

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla","Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero,one,two);

        animals.flatMap(l->l.stream()).forEach(System.out::println);

    }
}