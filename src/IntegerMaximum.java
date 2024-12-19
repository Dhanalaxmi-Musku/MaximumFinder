
public class IntegerMaximum {
	 public static Integer findMax(Integer x, Integer y, Integer z) {
	        Integer max = x;
	        if (y.compareTo(max) > 0) max = y;
	        if (z.compareTo(max) > 0) max = z;
	        System.out.println("Maximum integer is: " + max);
	        return max;
	    }

	    public static void testIntegerMax() {
	        System.out.println("\nTesting Integer Maximum:");
	        Integer result1 = findMax(30, 20, 10);
	        System.out.println("TC 1.1 Pass: " + (result1 == 30));
	        Integer result2 = findMax(20, 30, 10);
	        System.out.println("TC 1.2 Pass: " + (result2 == 30));
	        Integer result3 = findMax(10, 20, 30);
	        System.out.println("TC 1.3 Pass: " + (result3 == 30));
	    }
}


