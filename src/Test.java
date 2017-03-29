import java.util.stream.Stream;

public class Test{
    public static void main(String... args){
        Stream<Integer> streamInteger = Stream.iterate(1, n -> n+1);
        streamInteger.skip(5).limit(2).forEach(System.out::println);

    }
}