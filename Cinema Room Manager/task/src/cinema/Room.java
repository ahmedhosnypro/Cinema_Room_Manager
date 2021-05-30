package cinema;
import java.util.Scanner;

public class Room {
    String[][] room;
    private int rows;
    private int seats;

    Room() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        this.rows = rows;
        this.seats = seats;
        room = new String[rows + 1][seats + 1];
        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < seats + 1; j++) {
                if (i == 0 && j == 0){
                    room[i][j] = " ";
                }
                else if (i == 0){
                    room[i][j] = String.valueOf(j);
                }
                else if (j == 0){
                    room[i][j] = String.valueOf(i);
                }
                else room[i][j] = "S";
            }
        }
    }
    void printSeats() {
        for (String[] strings: room){
            for (int j = 0; j < strings.length; j++){
                if (j == room.length){
                    System.out.print(strings[j]);
                }
                else {
                    System.out.print(strings[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void setRoom(String[][] room) {
        this.room = room;
    }
    public void reserveSeat(int row, int seat){
        room[row][seat] = "B";
    }
    public int getRows() {
        return rows;
    }
    public int getSeats() {
        return seats;
    }
    public String[][] getRoom() {
        return room;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

}
