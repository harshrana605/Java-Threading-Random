#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

// Constants
const int MAX_SEATS = 100;

// Seat structure
struct Seat {
    int seatNumber;
    bool reserved;
    string passengerName;
};

// Flight class
class Flight {
private:
    string flightNumber;
    vector<Seat> seats;

public:
    Flight(string flightNum) : flightNumber(flightNum) {
        // Initialize seats
        for (int i = 0; i < MAX_SEATS; ++i) {
            Seat s;
            s.seatNumber = i + 1;
            s.reserved = false;
            seats.push_back(s);
        }
    }

    string getFlightNumber() const {
        return flightNumber;
    }

    // Reserve a seat
    bool reserveSeat(int seatNum, const string& passengerName) {
        if (seatNum < 1 || seatNum > MAX_SEATS) {
            cout << "Invalid seat number!" << endl;
            return false;
        }

        Seat& seat = seats[seatNum - 1];
        if (seat.reserved) {
            cout << "Seat " << seatNum << " is already reserved." << endl;
            return false;
        }

        seat.reserved = true;
        seat.passengerName = passengerName;
        cout << "Seat " << seatNum << " reserved for " << passengerName << endl;
        return true;
    }

    // Display available seats
    void displayAvailableSeats() const {
        cout << "Available Seats for Flight " << flightNumber << ":" << endl;
        cout << "-------------------------" << endl;
        for (const Seat& seat : seats) {
            if (!seat.reserved) {
                cout << "Seat " << setw(3) << seat.seatNumber << endl;
            }
        }
        cout << "-------------------------" << endl;
    }
};

// AirlineReservationSystem class
class AirlineReservationSystem {
private:
    vector<Flight> flights;

public:
    // Add a new flight
    void addFlight(const Flight& flight) {
        flights.push_back(flight);
    }

    // Reserve a seat on a flight
    void makeReservation(const string& flightNumber, int seatNum, const string& passengerName) {
        for (Flight& flight : flights) {
            if (flightNumber == flight.getFlightNumber()) {
                flight.reserveSeat(seatNum, passengerName);
                return;
            }
        }
        cout << "Flight " << flightNumber << " not found." << endl;
    }

    // Display available seats for a flight
    void displayAvailableSeats(const string& flightNumber) const {
        for (const Flight& flight : flights) {
            if (flightNumber == flight.getFlightNumber()) {
                flight.displayAvailableSeats();
                return;
            }
        }
        cout << "Flight " << flightNumber << " not found." << endl;
    }
};

int main() {
    AirlineReservationSystem system;

    // Adding some sample flights
    system.addFlight(Flight("ABC123"));
    system.addFlight(Flight("DEF456"));

    // Making reservations
    system.makeReservation("ABC123", 5, "John Doe");
    system.makeReservation("DEF456", 10, "Jane Smith");

    // Display available seats
    system.displayAvailableSeats("ABC123");
    system.displayAvailableSeats("DEF456");

    return 0;
}
