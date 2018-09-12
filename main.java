import static java.lang.System.out;

public class main
{
    public static void main(String[] args)
    {


        //case one: one person, one wallet, three cards [MasterCard, Visa, Discover]
        //gets all three card interest totals for case one
        MasterCard caseOneCardOne = new MasterCard(1);
        Visa caseOneCardTwo = new Visa(1);
        Discover caseOneCardThree = new Discover(1);
        out.println("The interest rate for this MasterCard is $" + caseOneCardOne.masterCardInterestRate);
        out.println("The interest rate for this Visa is $" + caseOneCardTwo.visaCardInterestRate);
        out.println("The interest rate for the Discover is $" + caseOneCardThree.discoverCardInterestRate);

        //get case one's wallet total
        Wallet caseOneWalletOne = new Wallet(1);
        out.println("The interest rate for this wallet is $" + caseOneWalletOne.interestRatePerWalletCaseOne);

        //get case one person's total interest
        Person caseOnePersonOne = new Person(1);
        out.println("The interest rate for this person is $" + caseOnePersonOne.interestRatePerPersonCaseOne);
        out.println();

        //case two: one person, two wallets (wallet one has Visa and Discover, wallet two has mastercard)
        //get card interest totals for case two
        MasterCard caseTwoCardOne = new MasterCard(1);
        Visa caseTwoCardTwo = new Visa(1);
        out.println("The interest rate for this MasterCard is $" + caseTwoCardOne.masterCardInterestRate);
        out.println("The interest rate for this Visa is $" + caseTwoCardTwo.visaCardInterestRate);

        //get case two's first wallet interest total
        Wallet caseTwoWalletOne = new Wallet(1);
        out.println("The interest rate for this wallet is $" + caseTwoWalletOne.interestRatePerWalletCaseTwoWalletOne);

        //get case two's second wallet interest total
        MasterCard caseTwoCardThree = new MasterCard(1);
        out.println("The interest rate for this MasterCard is $" + caseTwoCardThree.masterCardInterestRate);

        Wallet caseTwoWalletTwo = new Wallet(1);
        out.println("The interest rate for this wallet is $" + caseTwoWalletTwo.interestRatePerWalletCaseTwoWalletTwo);

        //get case two's person total
        Person caseTwoPersonOne = new Person(1);
        out.println("The interest rate for this person is $" + caseTwoPersonOne.interestRatePerPersonCaseTwo);
        out.println();

        //case three: 2 people: first person - one wallet (MC and visa) second person - one wallet (visa and MC)
        MasterCard caseThreePersonOneCardOne = new MasterCard(1);
        Visa caseThreePersonOneCardTwo = new Visa(1);
        out.println("The interest rate for this MasterCard is $" + caseThreePersonOneCardOne.masterCardInterestRate);
        out.println("The interest rate for this Visa is $" + caseThreePersonOneCardTwo.visaCardInterestRate);

        //get case three first person wallet interest total
        Wallet caseThreePersonOneWallet = new Wallet(1);
        out.println("The interest rate for this person is $" + caseThreePersonOneWallet.interestRatePerWalletCaseThreeWalletOne);

        //get case three first person's interest total
        Person caseThreePersonOne = new Person(1);
        out.println("The interest rate for this person is $" + caseThreePersonOne.interestRatePerPersonCaseThreePersonOne);
        out.println();

        //get case three second person card total
        MasterCard caseThreePersonTwoCardOne = new MasterCard(1);
        Visa caseThreePersonTwoCardTwo = new Visa(1);
        out.println("The interest rate for this MasterCard is $" + caseThreePersonTwoCardOne.masterCardInterestRate);
        out.println("The interest rate for this Visa is $" + caseThreePersonTwoCardTwo.visaCardInterestRate);

        //get case three second person wallet total
        Wallet caseThreePersonTwoWallet = new Wallet(1);
        out.println("The interest rate for this person is $" + caseThreePersonTwoWallet.getInterestRatePerWalletCaseThreeWalletTwo);

        //get case three person two interest total
        Person caseThreePersonTwo = new Person(1);
        out.println("The interest rate for this person is $" + caseThreePersonTwo.interestRatePerPersonCaseThreePersonTwo);
    }
}
