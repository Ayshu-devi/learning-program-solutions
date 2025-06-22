import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] earnings = new double[6];

        System.out.println("Enter past 6 months of earnings (in ₹):");
        for (int i = 0; i < earnings.length; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            earnings[i] = scanner.nextDouble();
        }

        Forecast.printEarnings(earnings);

        double nextForecast = Forecast.forecastNextMonth(earnings);
        System.out.printf("\n📈 Forecasted earning for next month: ₹%.2f\n", nextForecast);

        scanner.close();
    }
}
