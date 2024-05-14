import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.print("Enter the number of temperatures: ");
        int n = scanner.nextInt();

        // Step 2: Prompt the user to enter all the temperatures
        int[] temperatures = new int[n];
        System.out.println("Enter " + n + " temperatures:");
        for (int i = 0; i < n; i++) {
            temperatures[i] = scanner.nextInt();
        }

        // Step 3: Calculate the average temperature
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        double averageTemperature = (double) sum / n;

        System.out.println("Average temperature: " + averageTemperature);

        // Step 4: Count how many temperatures are above the average temperature
        int countAboveAverage = 0;
        for (int temperature : temperatures) {
            if (temperature > averageTemperature) {
                countAboveAverage++;
            }
        }

        System.out.println("Number of temperatures above the average: " + countAboveAverage);
    }
}
