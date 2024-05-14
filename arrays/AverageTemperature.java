package arrays;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the number of days
        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();
        double[] temperatures = new double[numDays];

        // Step 2: Prompt the user to enter temperatures for each day
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter the temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Step 3: Calculate the average temperature
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double averageTemperature = sum / numDays;
        System.out.printf("The average temperature is: %.2f\n", averageTemperature);

        // Step 4: Count how many days are above the average temperature
        int countAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                countAboveAverage++;
            }
        }

        System.out.println(countAboveAverage + " day(s) were above the average temperature.");
    }
}
