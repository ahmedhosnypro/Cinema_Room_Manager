package cinema;

import java.util.Scanner;

import static cinema.Print.*;
import static cinema.Ticket.*;
public class Action {
    static boolean selectAction(Room room){
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "0. Exit");
        int action = scanner.nextInt();
        switch (action){
            case 1:
                print(room);
                break;
            case 2:
                reserveTicket(room);
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
