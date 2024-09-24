class BookTheatreSeat {
    private int totalSeats = 15;

    public synchronized void bookSeat(int seats) {
        if (totalSeats >= seats) {
            System.out.println(Thread.currentThread().getName() + ": Seats Booked Successfully");
            totalSeats = totalSeats - seats;
            System.out.println(Thread.currentThread().getName() + ": Seats Left = " + totalSeats);
        } else {
            System.out.println(Thread.currentThread().getName() + ": Seats can't be booked");
            System.out.println(Thread.currentThread().getName() + ": Seats Left = " + totalSeats);
        }
    }
}

class MovieBookApp extends Thread {
    private BookTheatreSeat b;
    private int seats;

    public MovieBookApp(BookTheatreSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }
}

public class synchronization {
    public static void main(String[] args) {
        BookTheatreSeat b = new BookTheatreSeat();
        
        MovieBookApp harsh = new MovieBookApp(b, 7);
        harsh.setName("Harsh");
        
        MovieBookApp amit = new MovieBookApp(b, 10);
        amit.setName("Amit");
        
        harsh.start();
        amit.start();
    }
}
