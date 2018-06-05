import static java.lang.System.out;
import java.util.Scanner;

public class interestRateCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfPeople;
        int numberOfWallets;
        int numberOfCards;
        String cardBrand;
        double cardBalance;
        double mcInterestRate = .05;
        double visaInterestRate = .1;
        double discoverInterestRate = .01;
        double mcCardInterestRate;
        double visaCardInterestRate;
        double discoverCardInterestRate;
        double walletInterestRate = 0;
        double personInterestRate = 0;

        out.println("Interest Rate Calculator");
        out.println();
        out.println("How many people? ");
        numberOfPeople = keyboard.nextInt();
        while (numberOfPeople != 0) {
            out.print("How many wallets does this person have? ");
            numberOfWallets = keyboard.nextInt();
            numberOfPeople--;

            while (numberOfWallets != 0) {
                out.println("How many cards? ");
                numberOfCards = keyboard.nextInt();
                numberOfWallets--;
                while (numberOfCards != 0) {

                    out.println("what is the card brand?");
                    cardBrand = keyboard.next();

                    switch (cardBrand) {
                        case "Mastercard":
                            out.println("what is the card balance?");
                            cardBalance = keyboard.nextDouble();
                            mcCardInterestRate = cardBalance * mcInterestRate;
                            out.println("The total interest rate for this card is " + mcCardInterestRate);
                            walletInterestRate += mcCardInterestRate;
                            personInterestRate += walletInterestRate;
                            numberOfCards--;
                            break;
                        case "Visa":
                            out.println("what is the card balance?");
                            cardBalance = keyboard.nextDouble();
                            visaCardInterestRate = cardBalance * visaInterestRate;
                            out.println("The total interest rate for this card is " + visaCardInterestRate);
                            walletInterestRate += visaCardInterestRate;
                            personInterestRate += walletInterestRate;
                            numberOfCards--;
                            break;
                        case "Discover":
                            out.println("what is the card balance?");
                            cardBalance = keyboard.nextDouble();
                            discoverCardInterestRate = cardBalance * discoverInterestRate;
                            out.println("The total interest rate for this card is " + discoverCardInterestRate);
                            walletInterestRate += discoverCardInterestRate;
                            personInterestRate += walletInterestRate;
                            numberOfCards--;
                            break;
                        default:
                            out.println("Invalid input");
                            break;
                    }
                }
                out.println("The total interest rate for this wallet is " + walletInterestRate);
            }
            out.println("The total interest rate for this person is " + personInterestRate);
        }
    }
}

