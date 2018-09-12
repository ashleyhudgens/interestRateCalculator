public class MasterCard
{
    double masterCardInterestRate = 0;

    MasterCard()
    {
        //constructor
    }

    MasterCard(int numberOfMasterCardCards)
    {
        //calculates interest for MasterCard cards
        double cardBalance = 100;
        double interestRate = .05;
        masterCardInterestRate = cardBalance * interestRate;
    }
}
