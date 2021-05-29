package cinema;

import java.util.Scanner;
import static cinema.Print.print;
import static cinema.Profit.*;
import static cinema.Ticket.*;
import static cinema.Action.*;

public class Cinema {

    public static void main(String[] args) {
        Room room = new Room();
        while (selectAction(room));
    }
}