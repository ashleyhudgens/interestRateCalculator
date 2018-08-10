/* This script takes three cases and calculates simple interest for each card, each wallet and each person.
CASE 1: 1 person, 1 wallet 3 cards (MC, Visa, Discover) each card has $100 balance
CASE 2: 1 person, 2 wallets (1 wallet with 2 cards (Visa/Discover) 1 wallet with MC), each card has $100 balance
CASE 3: 2 people: First person has 1 wallet with 2 cards (MC/Visa) Second person has 1 wallet with 2 cards (MC/Visa)
*/
import static java.lang.System.out;

public class interestRateCalculator
{
    //returns card balance to calculate card interest
    public static double cardBalance(double balance)
    {
        return balance;
    }

    //gets case number from main to determine number of people and their wallets and then calls appropriate wallet method
    public static void example(int caseNumber)
    {
        if (caseNumber == 1)
        {
            int numberOfPeople = 1;
            out.println("Calculating interest rate for " + numberOfPeople + " person.");
            double oneWallet = calculateWalletInterestCaseOne(1);
            out.println("The total interest for this person is $" + oneWallet);
        } else if (caseNumber == 2)
        {
            int numberOfPeople = 1;
            out.println();
            out.println("Calculating interest rate for " + numberOfPeople + " person.");
            double oneWallet = calculateWalletInterestCaseTwoWalletOne(2);
            double twoWallets = calculateWalletInterestCaseTwoWalletTwo(1);
            double totalInterestPerPerson = oneWallet + twoWallets;
            out.println("The total interest for this person is $" + totalInterestPerPerson);
        } else if (caseNumber == 3)
        {
            int numberOfPeople = 2;
            out.println();
            out.println("Calculating interest rate for " + numberOfPeople + " people.");
            double firstPersonWallet = calculateWalletInterestCaseThreeFirstPersonWallet(1);
            out.println("The total interest for this person is $" + firstPersonWallet);
            double secondPersonWallet = calculateWalletInterestCaseThreeSecondPersonWallet(1);
            out.println("The total interest for this person is $" + secondPersonWallet);
        }
    }

    //specific method for case 3, second person to call calculateCardInterest method and calculate interest
    public static double calculateWalletInterestCaseThreeSecondPersonWallet(int numberOfWallets)
    {
        double cardOne = calculateCardInterest("MasterCard");
        double cardTwo = calculateCardInterest("Visa");
        double totalWalletInterest = cardOne + cardTwo;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        return totalWalletInterest;
    }

    //specific method for case 3, first person to call calculateCardInterest method and calculate interest
    public static double calculateWalletInterestCaseThreeFirstPersonWallet(int numberOfWallets)
    {
        double cardOne = calculateCardInterest("MasterCard");
        double cardTwo = calculateCardInterest("Visa");
        double totalWalletInterest = cardOne + cardTwo;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        return totalWalletInterest;
    }

    //specific method for case 2, wallet 2 to call calculateCardInterest method and calculate interest
    public static double calculateWalletInterestCaseTwoWalletTwo(int numberOfWallets)
    {
        double cardOne = calculateCardInterest("MasterCard");
        double totalWalletInterest = cardOne;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        return totalWalletInterest;
    }

    //specific method for case 2, wallet 1 to call calculateCardInterest method and calculate interest
    public static double calculateWalletInterestCaseTwoWalletOne (int numberOfWallets)
    {
        out.println("Calculating interest rate for " + numberOfWallets + " wallets.");
        double cardOne = calculateCardInterest("Visa");
        double cardTwo = calculateCardInterest("Discover");
        double totalWalletInterest = cardOne + cardTwo;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        out.println();
        return totalWalletInterest;
    }

    //specific method for case 1 to call calculateCardInterest method and calculate interest
    public static double calculateWalletInterestCaseOne(int numberOfWallets)
    {
        out.println("Calculating interest rate for " + numberOfWallets + " wallet.");
        double cardOne = calculateCardInterest("Visa");
        double cardTwo = calculateCardInterest("MasterCard");
        double cardThree = calculateCardInterest("Discover");
        double totalWalletInterest = cardOne + cardTwo + cardThree;
        out.println("The total interest for this wallet is $" + totalWalletInterest);
        out.println();
        return totalWalletInterest;
    }

    //method to calculate simple interest per card calculateCardInterest
    public static double calculateCardInterest(String cardBrand)
    {
        double cardInterest = 0;

        switch (cardBrand)
        {
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
                out.println("Invalid card calculateCardInterest");
                break;
        }
        double totalCardInterest = cardBalance(100) * cardInterest;
        out.println("The interest rate for this " + cardBrand + " card is $" + totalCardInterest);
        return totalCardInterest;
    }

    //main method
    public static void main(String[] args)
    {
        example(1);
        example(2);
        example(3);
    }
}

