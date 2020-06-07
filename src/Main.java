import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        List<Integer> numbersList = Stream.iterate(8, x -> x + 1)
                .filter(x -> x > 100 && x % 5 == 0)
                .map(x -> x * 3)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(numbersList);
    }
}