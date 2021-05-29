package cinema;

import java.util.Scanner;

public class Profit {
    static void calculateProfit() {
        System.out.println("Enter the number of rows:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        int profit = 0;
        if (rows * seats <= 60) {
            profit = rows * seats * 10;
        }
        else {
            int frontHalf = rows / 2;
            int backHalf = rows - frontHalf;
            profit = frontHalf * seats * 10;
            profit += backHalf * seats * 8;
        }
        System.out.println("Total income:");
        System.out.println("$" + profit);

    }
}
