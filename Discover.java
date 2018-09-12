public class Discover
{
    double discoverCardInterestRate = 0;

    Discover()
    {
        //constructor
    }

    Discover(int numberOfDiscoverCards)
    {
        //calculates interest for a Discover card
        double cardBalance = 100;
        double interestRate = .01;
        discoverCardInterestRate = cardBalance * interestRate;
    }
}
