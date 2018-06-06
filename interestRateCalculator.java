//import modules
import static java.lang.System.out;
import java.util.Scanner;

public class interestRateCalculator
{
    public static void main(String[] args)
    {
        //declare variables
        Scanner keyboard = new Scanner(System.in);
        String cardBrand;
        double cardInterestRate;
        double cardInterest;
        double cardBalance;
        int numberOfCards;
        int numberOfWallets;
        double walletTotal = 0;
        int numberOfPeople;
        double perPersonInterest = 0;

        out.println("Interest Rate Calculator");
        out.println();

        //run through each person to get total interest rate per card, per wallet and per person
        out.print("How many people? ");
        numberOfPeople = keyboard.nextInt();

        while (numberOfPeople != 0)
        {
            out.print("How many wallets? ");
            numberOfWallets = keyboard.nextInt();

            while (numberOfWallets != 0)
            {
                out.print("How many cards? ");
                numberOfCards = keyboard.nextInt();

                while (numberOfCards != 0)
                {
                    out.print("What is the card brand? ");
                    cardBrand = keyboard.next();

                    cardInterestRate = getInterestRate(cardBrand);

                    out.print("What is the balance on the card? ");
                    cardBalance = keyboard.nextDouble();

                    cardInterest = getCardInterest(cardInterestRate, cardBalance);
                    walletTotal += cardInterest;
                    perPersonInterest += walletTotal;

                    out.println("The total interest for this " + cardBrand + " is " + cardInterest);
                    numberOfCards--;
                }
                out.println("The total interest for this wallet is " + walletTotal);
                numberOfWallets--;
            }
            out.println("The total interest for this person is " + perPersonInterest);
            numberOfPeople--;
        }

    }

    private static double getCardInterest (double cardInterestRate, double cardBalance)
    {
        //calculates total interest per card depending on the current balance on the card and current interest rate
        return cardInterestRate * cardBalance;
    }


    private static double getInterestRate (String cardBrand)
    {
        //determines current interest rate according to card brand
        double interestRate = 0;

        switch (cardBrand)
        {
            case "Mastercard":
                interestRate = .05;
                break;
            case "Visa":
                interestRate = .1;
                break;
            case "Discover":
                interestRate = .01;
                break;
            default:
                out.println("Invalid input");
                break;
        }
       return interestRate;
    }

}

