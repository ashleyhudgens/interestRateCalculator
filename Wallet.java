public class Wallet
{

    double interestRatePerWalletCaseOne = 0;
    double interestRatePerWalletCaseTwoWalletOne = 0;
    double interestRatePerWalletCaseTwoWalletTwo = 0;
    double interestRatePerWalletCaseThreeWalletOne = 0;
    double getInterestRatePerWalletCaseThreeWalletTwo = 0;


    Wallet()
    {
        //constructor
    }

    Wallet(int numberOfWallets)
    {
        //case one set up to calculate wallet total
        MasterCard caseOneCardOne = new MasterCard(1);
        Visa caseOneCardTwo = new Visa(1);
        Discover caseOneCardThree = new Discover(1);
        interestRatePerWalletCaseOne = (caseOneCardOne.masterCardInterestRate + caseOneCardTwo.visaCardInterestRate + caseOneCardThree.discoverCardInterestRate);

        //case two set up to calculate first wallet total
        MasterCard caseTwoCardOne = new MasterCard(1);
        Visa caseTwoCardTwo = new Visa(1);
        interestRatePerWalletCaseTwoWalletOne = caseTwoCardOne.masterCardInterestRate + caseTwoCardTwo.visaCardInterestRate;

        //case two set up to calculate second wallet total
        MasterCard caseTwoCardThree = new MasterCard(1);
        interestRatePerWalletCaseTwoWalletTwo = caseTwoCardThree.masterCardInterestRate;

        //case three set up to calculate wallet for first person
        MasterCard caseThreeWalletOneCardOne = new MasterCard(1);
        Visa caseThreeWalletOneCardTwo = new Visa(1);
        interestRatePerWalletCaseThreeWalletOne = caseThreeWalletOneCardOne.masterCardInterestRate + caseThreeWalletOneCardTwo.visaCardInterestRate;

        //case three set up to calculate wallet for second person
        MasterCard caseThreeWalletTwoCardOne = new MasterCard(1);
        Visa caseThreeWalletTwoCardTwo = new Visa(1);
        interestRatePerWalletCaseTwoWalletTwo = caseThreeWalletTwoCardTwo.visaCardInterestRate + caseThreeWalletTwoCardOne.masterCardInterestRate;


    }
}
