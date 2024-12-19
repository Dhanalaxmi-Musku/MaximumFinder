
public class StringMaximum {
	public static String findMax(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        System.out.println("Maximum string is: " + max);
        return max;
    }

    public static void testStringMax() {
        System.out.println("\nTesting String Maximum:");
        String result1 = findMax("Peach", "Banana", "Apple");
        System.out.println("TC 3.1 Pass: " + result1.equals("Peach"));
        String result2 = findMax("Banana", "Peach", "Apple");
        System.out.println("TC 3.2 Pass: " + result2.equals("Peach"));
        String result3 = findMax("Apple", "Banana", "Peach");
        System.out.println("TC 3.3 Pass: " + result3.equals("Peach"));
    }

}
