package cinema;

import static cinema.Action.*;

public class Cinema {

    public static void main(String[] args) {
        Room room = new Room();
        while (selectAction(room)) ;
    }
}