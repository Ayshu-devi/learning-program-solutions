
public class Forecast {
    public static double forecastNextMonth(double[] earnings) {
        if (earnings.length < 3) {
            throw new IllegalArgumentException("Need at least 3 months of data.");
        }

        int n = earnings.length;
        double sum = earnings[n - 1] + earnings[n - 2] + earnings[n - 3];
        return sum / 3;
    }

    public static void printEarnings(double[] earnings) {
        System.out.println("Past Earnings:");
        for (int i = 0; i < earnings.length; i++) {
            System.out.println("Month " + (i + 1) + ": ₹" + earnings[i]);
        }
    }
}
