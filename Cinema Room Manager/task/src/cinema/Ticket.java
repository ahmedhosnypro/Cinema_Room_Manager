package cinema;
import java.util.Scanner;
import static cinema.Print.*;

public class Ticket{
    static int ticketPrice(int row, int seat, Room room) {

        int price = 0;
        if (room.getRows() * room.getSeats() <= 60) {
            price = 10;
        }
        else {
            int frontHalf = room.getRows() / 2;
            if (row <= frontHalf){
                price = 10;
            }
            else {
                price = 8;
            }
        }
        return price;
    }
    static void reserveTicket(Room room){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int row = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seat = scanner.nextInt();
        if (row > room.getRows() || seat > room.getSeats()){
            System.out.println("\nWrong input!");
            reserveTicket(room);
        }
        else {
            if (room.getRoom()[row][seat].equals("B")){
                System.out.println("\nThat ticket has already been purchased!");
                reserveTicket(room);
            }
            else {
                int price = ticketPrice(row, seat, room);
                System.out.println("\nTicket price: $" + price);
                room.reserveSeat(row, seat);
            }
        }

    }
}
