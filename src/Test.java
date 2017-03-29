import java.util.stream.Stream;

public class Test{
    public static void main(String... args){
        Stream<Integer> streamInteger = Stream.iterate(1, n -> n+1);
        Stream<Integer> newStream = streamInteger.skip(5).limit(5);
        newStream.forEach(System.out::println);
        Stream<String> streamString = Stream.of("monkey","gorilla","bonobo");
        Stream<Integer> numStream = streamString.map(String::length);
        numStream.forEach(System.out::println);

    }
}