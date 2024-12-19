import java.util.Arrays;
import java.util.Optional;

class MaximumFinder<T extends Comparable<T>> {
    private T[] elements;
    public MaximumFinder(T... elements) {
        this.elements = elements;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T findMax(T... elements) {
        Optional<T> max = Arrays.stream(elements)
                               .sorted((a, b) -> b.compareTo(a)) 
                               .findFirst();  
        if (max.isPresent()) {
            printMax(max.get());
            return max.get();
        } else {
            throw new IllegalArgumentException("Array cannot be empty");
        }
    }

    public T testMaximum() {
        return findMax(elements);
    }

    private static <T> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }

    public static void testExtendedMax() {
        System.out.println("\nTesting Extended Maximum Implementation:");

        MaximumFinder<Integer> intMax = new MaximumFinder<>(10, 20, 30, 40, 50);
        intMax.testMaximum();

        MaximumFinder<String> stringMax = new MaximumFinder<>("Apple", "Peach", "Banana", "Orange", "Mango");
        stringMax.testMaximum();
    }
}