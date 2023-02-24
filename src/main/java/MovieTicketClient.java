
public class MovieTicketClient extends Thread {
  private String customerName;
  private int amountOfTickets;
  private MovieTicketServer movieTicketServer;

  public MovieTicketClient(String customerName, int amountOfTickets, MovieTicketServer movieTicketServer) {
    this.customerName = customerName;
    this.amountOfTickets = amountOfTickets;
    this.movieTicketServer = movieTicketServer;
  }

  public void run() {
      this.movieTicketServer.bookTicket(customerName, amountOfTickets);
  }
}
