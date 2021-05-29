package cinema;

public class Seats {
    static String[][] seats = new String[8][9];
    static {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 0){
                    seats[i][j] = " ";
                }
                else if (i == 0){
                    seats[i][j] = String.valueOf(j);
                }
                else if (j == 0){
                    seats[i][j] = String.valueOf(i);
                }
                else seats[i][j] = "S";
            }
        }
    }
    static void printSeats() {
        for (String[] strings: seats){
            for (int j = 0; j < strings.length; j++){
                if (j == seats.length){
                    System.out.print(strings[j]);
                }
                else {
                    System.out.print(strings[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
