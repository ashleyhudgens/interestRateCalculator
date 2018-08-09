import static java.lang.System.out;


public class interestRateCalculator
{
    public static double cardBalance(double balance)
    {
        return balance;
    }

    public static double people(int numberOfPeople)
    {
        double interest = 0;
            if (numberOfPeople == 1) {
                out.println("Calculating interest rate for " + numberOfPeople + " person.");
                wallets(1);
                out.println("Calculating interest rate for " + numberOfPeople + " person.");

                wallets(2);
                numberOfPeople--;
            }

        return interest;
    }

    public static double wallets(int numberOfWallets)
    {
        double perPerson = 0;
        if (numberOfWallets == 1) {
            out.println("Calculating interest rate for " + numberOfWallets + " wallet.");
            double walletOne = cards(3);
            perPerson = walletOne;
        } else if (numberOfWallets == 2)
        {
            out.println("Calculating interest rate for " + numberOfWallets + " wallets.");
            double walletOne = cards(2);
            double walletTwo = cards(1);
            perPerson = walletOne + walletTwo;
        }
        out.println("The total interest for this person is $" + perPerson);
        out.println();

        return perPerson;
    }

    public static double cards(int numberOfCards)
    {
        double perWallet = 0;
        if (numberOfCards == 3) {
            out.println("Calculating interest rate for " + numberOfCards + " cards.");
            double cardOne = brand("Visa");
            double cardTwo = brand("Discover");
            double cardThree = brand("MasterCard");
            perWallet = cardOne + cardTwo + cardThree;
        } else if (numberOfCards == 2)
        {
            double cardOne = brand("Visa");
            double cardTwo = brand("Discover");
            perWallet = cardOne + cardTwo;
        } else if (numberOfCards == 1)
        {
            double cardOne = brand("MasterCard");
            perWallet = cardOne;
        }
        out.println("Total interest for this wallet is $" + perWallet);
        return perWallet;
    }

    public static double brand(String cardBrand)
    {
        double cardInterest = 0;

        switch (cardBrand) {
            case "MasterCard":
                cardInterest = .05;
                break;
            case "Visa":
                cardInterest = .1;
                break;
            case "Discover":
                cardInterest = .01;
                break;
            default:
                out.println("Invalid card brand");
                break;
        }
        double totalCardInterest = cardBalance(100) * cardInterest;
        out.println("The interest rate for this " + cardBrand + " card is $" + totalCardInterest);
        return totalCardInterest;
    }

    public static void main(String[] args)
    {
        double caseOne = people(1);
    }
}
