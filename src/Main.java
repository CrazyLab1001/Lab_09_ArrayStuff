import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1; // 1-100
        }
        for (int x = 0; x < dataPoints.length; x++) {
            System.out.printf("%3d%2s", dataPoints[x], "|");// lists values (in one line)
        }
        int sum = 0;
        double average = 0;
        for (int x = 0; x < dataPoints.length; x++) {
            sum = sum + dataPoints[x];
            average = sum / dataPoints.length;
        }
        System.out.println("\nThe sum of these values is " + sum + ".");
        System.out.println("The average of these values is " + average + ".");
    }
}