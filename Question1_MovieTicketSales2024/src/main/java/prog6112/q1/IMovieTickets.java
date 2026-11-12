package prog6112.q1;

/**
 *
 * @author anphewa
 */

// An interface lists the methods that a class must provide.
// The methods do not have any code here; their code is written in MovieTickets.
public interface IMovieTickets {

    // Receives the sales for one movie and returns the total for all three months.
    int TotalMovieSales(int[] movieTicketSales);

    // Receives movie names and their totals, then returns the top movie name.
    String TopMovie(String[] movies, int[] totalSales);

} // Ends the IMovieTickets interface.
