import java.util.Random;
import java.util.Scanner;

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
        int minimum = dataPoints[0];
        int maximum = dataPoints[0];
        for (int x = 0; x < dataPoints.length; x++) {
            if (minimum > dataPoints[x]){
                minimum = dataPoints[x];
            }
            if (maximum < dataPoints[x]){
                maximum = dataPoints[x];
            }

        }
        System.out.println("\nThe sum of these values is " + sum + ".");
        System.out.println("The average of these values is " + average + ".");
        System.out.println("Using an external method, the average also results to " + SafeInput.getAverage(dataPoints) + ".");
        System.out.println("The minimum of these values is " + minimum + ".");
        System.out.println("The maximum of these values is " + maximum + ".");




        //Scanner stuff
        Scanner in = new Scanner(System.in);
        int searchingPoint = 0;
        searchingPoint = SafeInput.getRangedInt(in,"Please input a number 1-100 to search for", 1, 100);
        boolean searchingPointFound = false;
        for (int x = 0; x < dataPoints.length; x++) {
            if (searchingPoint == dataPoints[x]) {
                System.out.println("I found " + searchingPoint + " at data point " + x + "!");
                searchingPointFound = true;
            }
        }
        if (searchingPointFound == false) {
            System.out.println("I couldn't find " + searchingPoint + "! :(");
        }

        searchingPoint = SafeInput.getRangedInt(in,"Please input a number 1-100 to search for (again, but this time I'll stop if I find it once!)", 1, 100);
        searchingPointFound = false;
        for (int x = 0; x < dataPoints.length; x++) {
            if (searchingPoint == dataPoints[x]) {
                System.out.println("I found the first " + searchingPoint + " at data point " + x + "!");
                searchingPointFound = true;
                break;
            }
        }
        if (searchingPointFound == false) {
            System.out.println("I couldn't find " + searchingPoint + "! :(");}
    }
}