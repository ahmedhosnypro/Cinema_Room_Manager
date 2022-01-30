package cinema;

import java.util.Scanner;

import static cinema.Print.*;
import static cinema.Statistics.showStatistics;
import static cinema.Ticket.*;

public class Action {
    static boolean selectAction(Room room) {
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exitt");
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                print(room);
                break;
            case 2:
                reserveTicket(room);
                break;
            case 3:
                showStatistics(room);
                break;
            case 0:
                isContinue = false;
                break;
            default:
                break;
        }
        return isContinue;
    }
}