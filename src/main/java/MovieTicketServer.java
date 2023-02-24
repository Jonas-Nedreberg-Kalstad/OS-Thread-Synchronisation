
public class MovieTicketServer {
  private final String movieName;
  private int availableSeats;
  private final int numberOfSeats;

  public MovieTicketServer(String movieName, int numberOfSeats) {
    this.movieName = movieName;
    this.numberOfSeats = numberOfSeats;
    this.availableSeats = numberOfSeats;
  }

  public void bookTicket(String customerName, int amountOfTickets) {
    System.out.println("Hi," + customerName + " : " + availableSeats + " : Seats available for " + movieName);

    if (availableSeats <= amountOfTickets) {
      System.out.println("Hi," + customerName + " : Seats not available for " + movieName);
    } else {
      System.out.println("Hi," + customerName + " : " + numberOfSeats + " Seats booked successfully for " + movieName);
      this.availableSeats = -amountOfTickets;
    }
  }
}