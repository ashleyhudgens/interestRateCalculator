public class Visa
{

    double visaCardInterestRate = 0;

    Visa()
    {
        //constructor
    }

    Visa(int numberOfVisaCards)
    {
        //calculates interest for a Visa card
        double cardBalance = 100;
        double interestRate = .1;
        visaCardInterestRate = cardBalance * interestRate;
    }

}
