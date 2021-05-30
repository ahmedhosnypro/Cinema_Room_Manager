package cinema;

public class Statistics {
    static void showStatistics(Room room){
        System.out.println();
        System.out.printf("Number of purchased tickets: %d\n", ticketsNumber(room));
        System.out.printf("Percentage: %.2f%%\n", ticketsPercentages(room));
        System.out.printf("Current income: $%d\n", currentIncome(room));
        System.out.printf("Total income: $%d\n", totalIncome(room));
    }
    static int ticketsNumber(Room room){
        int count = 0;
        for (int i = 0; i < room.getRows() + 1; i++) {
            for (int j = 0; j < room.getSeats() + 1; j++) {
                if (i != 0 && j != 0){
                    if (!room.getRoom()[i][j].equals("S"))
                        count++;
                }
            }
        }
        return count;
    }
    static double ticketsPercentages(Room room){
        double ticketsNumber = ticketsNumber(room);
        double percentages = 0;
        if (ticketsNumber > 0){
            percentages = ticketsNumber / (room.getRows() * room.getSeats());
        }
        percentages *= 100;
        return percentages;
    }
    static int currentIncome(Room room){
        int currentIncome = 0;
        if (room.getRows() * room.getSeats() <= 60){
            for (int i = 0; i < room.getRows() + 1; i++) {
                for (int j = 0; j < room.getSeats() + 1; j++) {
                    if (i != 0 && j != 0){
                        if (!room.getRoom()[i][j].equals("S"))
                            currentIncome += 10;
                    }
                }
            }
        }
        else {
            int frontHalf = room.getRows() / 2;
            int backHalf = room.getRows() - frontHalf;
            for (int i = 0; i < room.getRows() + 1; i++) {
                for (int j = 0; j < room.getSeats() + 1; j++) {
                    if (i != 0 && j != 0){
                        if (!room.getRoom()[i][j].equals("S")){
                            if (i <= frontHalf){
                                currentIncome += 10;
                            }
                            else {
                                currentIncome += 8;
                            }
                        }
                    }
                }
            }
        }
        return currentIncome;
    }
    static int totalIncome(Room room){
        int income = 0;
        if (room.getRows() * room.getSeats() <= 60){
            income = room.getRows() * room.getSeats() * 10;
        }
        else {
            int frontHalf = room.getRows() / 2;
            int backHalf = room.getRows() - frontHalf;
            income += frontHalf * room.getSeats() * 10;
            income += backHalf * room.getSeats() * 8;
        }
        return income;
    }
}
