import static java.lang.System.out;

public class interestRateCalculator 
{
    private static double cardBalance(double balance) 
    {
        return balance;
    }

    private static void people(int caseNumber) 
    {
        if (caseNumber == 1) 
        {
            int numberOfPeople = 1;
            out.println("Calculating interest rate for " + numberOfPeople + " person.");
            double oneWallet = caseOneWallet(1);
            out.println("The total interest for this person is $" + oneWallet);
        } else if (caseNumber == 2) 
        {
            int numberOfPeople = 1;
            out.println();
            out.println("Calculating interest rate for " + numberOfPeople + " person.");
            double oneWallet = caseTwoWalletOne(2);
            double twoWallets = caseTwoWalletTwo(1);
            double totalInterestPerPerson = oneWallet + twoWallets;
            out.println("The total interest for this person is $" + totalInterestPerPerson);
        } else if (caseNumber == 3)
        {
            int numberOfPeople = 2;
            out.println();
            out.println("Calculating interest rate for " + numberOfPeople + " people.");
            double firstPersonWallet = caseThreeFirstPersonWallet(1);
            out.println("The total interest for this person is $" + firstPersonWallet);
            double secondPersonWallet = caseThreeSecondPersonWallet(1);
            out.println("The total interest for this person is $" + secondPersonWallet);
        }
    }


    private static double caseThreeSecondPersonWallet(int numberOfWallets)
    {
        double cardOne = brand("MasterCard");
        double cardTwo = brand("Visa");
        double totalWalletInterest = cardOne + cardTwo;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        return totalWalletInterest;
    }

    private static double caseThreeFirstPersonWallet(int numberOfWallets)
    {
        double cardOne = brand("MasterCard");
        double cardTwo = brand("Visa");
        double totalWalletInterest = cardOne + cardTwo;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        return totalWalletInterest;
    }


    private static double caseTwoWalletTwo(int numberOfWallets)
    {
        double cardOne = brand("MasterCard");
        double totalWalletInterest = cardOne;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        return totalWalletInterest;
    }

    private static double caseTwoWalletOne (int numberOfWallets)
    {
        out.println("Calculating interest rate for " + numberOfWallets + " wallets.");
        double cardOne = brand("Visa");
        double cardTwo = brand("Discover");
        double totalWalletInterest = cardOne + cardTwo;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        out.println();
        return totalWalletInterest;
    }


    private static double caseOneWallet(int numberOfWallets)
    {
        out.println("Calculating interest rate for " + numberOfWallets + " wallet.");
        double cardOne = brand("Visa");
        double cardTwo = brand("MasterCard");
        double cardThree = brand("Discover");
        double totalWalletInterest = cardOne + cardTwo + cardThree;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        out.println();
        return totalWalletInterest;
    }

    private static double brand(String cardBrand)
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
        people(1);
        people(2);
        people(3);
    }
}
