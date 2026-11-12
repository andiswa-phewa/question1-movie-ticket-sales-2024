package prog6112.q1;

/**
 *
 * @author anphewa
 */

// implements means this class must provide all methods in IMovieTickets.
public class MovieTickets implements IMovieTickets {

    // @Override shows that this method comes from the interface.
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {

        // Start at zero before adding the monthly ticket sales.
        int total = 0;

        // Visit each position in the one-dimensional array.
        for (int index = 0; index < movieTicketSales.length; index++) {
            total = total + movieTicketSales[index];
        } // Ends the loop.

        // Give the calculated total back to the calling method.
        return total;
    } // Ends the TotalMovieSales method.

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {

        // Start by assuming the first movie is the top performer.
        String topMovie = movies[0];
        int highestSales = totalSales[0];

        // Compare the remaining movies against the current highest total.
        for (int index = 1; index < totalSales.length; index++) {

            // If this movie has more sales, update both stored values.
            if (totalSales[index] > highestSales) {
                highestSales = totalSales[index];
                topMovie = movies[index];
            } // Ends the if statement.

        } // Ends the loop.

        // Return the name, not the number of tickets.
        return topMovie;
    } // Ends the TopMovie method.

} // Ends the MovieTickets class.
