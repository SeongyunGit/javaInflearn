package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }
    public static double average(int[] values) {
        return (double) sum(values) /values.length;
    }

    public static int min(int[] values) {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<values.length;i++) {
            if (min>values[i]) {
                min = values[i];
            }
        }
        return min;
    }


    public static int max(int[] values) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<values.length;i++) {
            if (max<values[i]) {
                max = values[i];
            }
        }
        return max;
    }
}
