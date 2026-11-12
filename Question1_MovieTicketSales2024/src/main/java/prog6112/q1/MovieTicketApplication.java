package prog6112.q1;
/**
 *
 * @author anphewa
 */

// This class displays the 2024 movie-ticket sales report.
public class MovieTicketApplication {

    // These arrays are declared inside the class but OUTSIDE main().
    // static allows the main method to use them directly without creating
    // a MovieTicketApplication object.

    // One-dimensional array: names of the two movies.
    static String[] movies = {"Napoleon", "Oppenheimer"};

    // One-dimensional array: the three month headings.
    static String[] months = {"JAN", "FEB", "MAR"};

    // Two-dimensional array: rows are movies and columns are months.
    static int[][] movieTicketSales = {
        {3000, 1500, 1700},  // Napoleon: January, February, March.
        {3500, 1200, 1600}   // Oppenheimer: January, February, March.
    };

    // One-dimensional array: totals to be calculated for each movie.
    static int[] totalSales = new int[movies.length];

    // Java starts running the program inside the main method.
    public static void main(String[] args) {

        // Create the object that performs the calculations.
        MovieTickets ticketCalculator = new MovieTickets();

        // Display the report heading.
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println();

        // Display the three month headings, using tabs for the columns.
        System.out.print("\t\t\t");
        for (int column = 0; column < months.length; column++) {
            System.out.print(months[column] + "\t\t");
        } // Ends the month-heading loop.
        System.out.println();
        System.out.println("------------------------------------------------------------");

        // The outer loop moves between movies (rows in the 2D array).
        for (int row = 0; row < movieTicketSales.length; row++) {

            // Print the name belonging to the current movie row.
            System.out.print(movies[row] + "\t\t");

            // The inner loop prints the three monthly sales (columns).
            for (int column = 0; column < movieTicketSales[row].length; column++) {
                System.out.print(movieTicketSales[row][column] + "\t\t");
            } // Ends the column loop.
            System.out.println();

            // Calculate the total for the current movie using the class method.
            totalSales[row] = ticketCalculator.TotalMovieSales(movieTicketSales[row]);

        } // Ends the movie-row loop.

        System.out.println();

        // Print each movie's total. Reuse the values already calculated above.
        for (int row = 0; row < movies.length; row++) {
            System.out.println("Total movie ticket sales for " + movies[row]
                    + " " + totalSales[row]);
        } // Ends the totals loop.

        System.out.println();

        // Ask the MovieTickets class to find the best-performing movie.
        String topMovie = ticketCalculator.TopMovie(movies, totalSales);
        System.out.println("Top performing movie: " + topMovie);

    } // Ends the main method.

} // Ends the MovieTicketApplication class.
