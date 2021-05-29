package cinema;


import java.util.Scanner;

import static cinema.Print.print;
import static cinema.Profit.*;
import static cinema.Ticket.*;

public class Cinema {

    public static void main(String[] args) {
        Room room = new Room();
        print(room);
        //calculateProfit();
        reserveTicket(room);
    }
}