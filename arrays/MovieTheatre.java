package arrays;

public class MovieTheatre {
    private final char[][] seats;

    // Constructor to initialize the seating chart
    public MovieTheatre(int rows, int cols) {
        seats = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = '0';
            }
        }
    }

    // Method to display the seating chart
    public void displaySeatingChart() {
        for (char[] row : seats) {
            for (char seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    // Method to reserve a seat
    public void reserveSeat(int row, int col) {
        if (row >= seats.length || col >= seats[0].length || row < 0 || col < 0) {
            System.out.println("Invalid seat number.");
            return;
        }
        if (seats[row][col] == 'X') {
            System.out.println("Sorry, the seat is already taken.");
        } else {
            seats[row][col] = 'X';
            System.out.println("Seat reserved successfully.");
        }
    }

    public static void main(String[] args) {
        MovieTheatre theatre = new MovieTheatre(5, 5);
        System.out.println("Initial seating chart:");
        theatre.displaySeatingChart();

        // Reserve seats and display the seating chart
        System.out.println("\nReserving seat at (2, 2):");
        theatre.reserveSeat(2, 2);
        theatre.displaySeatingChart();

        // Attempt to reserve the same seat
        System.out.println("\nAttempting to reserve the same seat at (2, 2):");
        theatre.reserveSeat(2, 2);

        // Reserve another seat and display the seating chart
        System.out.println("\nReserving seat at (4, 4):");
        theatre.reserveSeat(4, 4);
        theatre.displaySeatingChart();
    }
}