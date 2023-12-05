package HomeWork_4;


import java.util.Arrays;

public class Pirson {
    public static void main(String[] args) {
        double[] x = {10,20,29};
        double[] y = {1,2,3};

        double correlation = calculatePearsonCorrelation(x, y);
        System.out.println("Pearson correlation: " + correlation);

    }

    public static double calculatePearsonCorrelation(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumXSquare = 0;
        double sumYSquare = 0;

        int n = x.length;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumXSquare += x[i] * x[i];
            sumYSquare += y[i] * y[i];
        }

        double numerator = n * sumXY - sumX * sumY;
        double denominator = Math.sqrt((n * sumXSquare - sumX * sumX) * (n * sumYSquare - sumY * sumY));
        System.out.println(numerator);
        System.out.println(denominator);

        return numerator / denominator;
    }
}