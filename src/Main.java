import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Stream.iterate(8, x -> x + 1)
                .filter(x -> x > 100)
                .filter(x -> x % 5 == 0)
                .map(x -> x * 3)
                .limit(10)
                .forEach(System.out::println);
    }
}