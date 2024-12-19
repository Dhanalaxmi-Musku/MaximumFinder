public class MaximumFinder<T extends Comparable<T>> {
	private T x;
    private T y;
    private T z;

    public MaximumFinder(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        printMax(max);
        return max;
    }
    public T testMaximum() {
        return findMax(x, y, z);
    }

    private static <T> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }

    public static void testGenericMax() {
        System.out.println("\nTesting Generic Maximum:"); 
        MaximumFinder<Integer> intMax = new MaximumFinder<>(10, 20, 30);
        System.out.println("Generic Integer Test Pass: " + (intMax.testMaximum() == 30));
        MaximumFinder<Float> floatMax = new MaximumFinder<>(10.5f, 20.5f, 30.5f);
        System.out.println("Generic Float Test Pass: " + (floatMax.testMaximum() == 30.5f));
        MaximumFinder<String> stringMax = new MaximumFinder<>("Apple", "Peach", "Banana");
        System.out.println("Generic String Test Pass: " + stringMax.testMaximum().equals("Peach"));
    }
}
