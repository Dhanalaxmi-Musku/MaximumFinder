
public class FloatMaximum {
	public static Float findMax(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        System.out.println("Maximum float is: " + max);
        return max;
    }

    public static void testFloatMax() {
        System.out.println("\nTesting Float Maximum:");
        Float result1 = findMax(30.5f, 20.5f, 10.5f);
        System.out.println("TC 2.1 Pass: " + (result1 == 30.5f));
        Float result2 = findMax(20.5f, 30.5f, 10.5f);
        System.out.println("TC 2.2 Pass: " + (result2 == 30.5f));
        Float result3 = findMax(10.5f, 20.5f, 30.5f);
        System.out.println("TC 2.3 Pass: " + (result3 == 30.5f));
    }

}
