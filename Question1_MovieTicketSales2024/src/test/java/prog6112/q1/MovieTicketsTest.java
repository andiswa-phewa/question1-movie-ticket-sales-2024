package prog6112.q1;

// JUnit 5 imports: @Test identifies a test; assertEquals compares results.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// NetBeans runs these methods when you select Test Project.
public class MovieTicketsTest {

    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {

        // Arrange: create the object and supply Napoleon's monthly sales.
        MovieTickets movieTickets = new MovieTickets();
        int[] movieTicketSales = {3000, 1500, 1700};
        int expected = 6200;

        // Act: call the method that the question asks us to test.
        int actual = movieTickets.TotalMovieSales(movieTicketSales);

        // Assert: the test passes if the returned value is 6200.
        assertEquals(expected, actual);

    } // Ends the first test.

    @Test
    public void TopMovieSales_ReturnsTopMovie() {

        // Arrange: provide the two movies and their calculated totals.
        MovieTickets movieTickets = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300};
        String expected = "Oppenheimer";

        // Act: ask for the movie with the highest ticket sales.
        String actual = movieTickets.TopMovie(movies, totalSales);

        // Assert: the movie name should match the expected name.
        assertEquals(expected, actual);

    } // Ends the second test.

} // Ends the MovieTicketsTest class.
