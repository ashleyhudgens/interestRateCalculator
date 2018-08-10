import org.junit.Test;

import static org.junit.Assert.*;

public class interestRateCalculatorTest 
{

    @Test
    public void cardBalanceTest() throws Exception
    {
        double balance = interestRateCalculator.cardBalance(100);
        assertEquals(100, balance, 0);
    }


    @Test
    public void calculateWalletInterestCaseThreeSecondPersonWalletTest() throws Exception
    {
        double caseThreeWalletSecondPerson = interestRateCalculator.calculateWalletInterestCaseThreeSecondPersonWallet(1);
        assertEquals(15, caseThreeWalletSecondPerson, 0);
    }

    @Test
    public void calculateWalletInterestCaseThreeFirstPersonWalletTest() throws Exception 
    {
        double caseThreeFirstPerson = interestRateCalculator.calculateWalletInterestCaseThreeFirstPersonWallet(1);
        assertEquals(15, caseThreeFirstPerson, 0);
    }

    @Test
    public void calculateWalletInterestCaseTwoWalletTwoTest() throws Exception 
    {
        double caseTwoWalletTwo = interestRateCalculator.calculateWalletInterestCaseTwoWalletTwo(1);
        assertEquals(5, caseTwoWalletTwo, 0);

    }

    @Test
    public void calculateWalletInterestCaseTwoWalletOneTest() throws Exception
    {
        double caseTwoWalletOne = interestRateCalculator.calculateWalletInterestCaseTwoWalletOne(1);
        assertEquals(11, caseTwoWalletOne, 0);

    }

    @Test
    public void calculateWalletInterestCaseOneTest() throws Exception
    {
        double walletInterest = interestRateCalculator.calculateWalletInterestCaseOne(1);
        assertEquals(16.0, walletInterest,0);

    }

    @Test
    public void calculateMasterCardInterestTest() throws Exception
    {
        Double cardInterest = interestRateCalculator.calculateCardInterest("MasterCard");
        assertEquals(5, cardInterest.intValue());
    }

    @Test
    public void calculateDiscoverInterestTest() throws Exception
    {
        Double cardInterest = interestRateCalculator.calculateCardInterest("Discover");
        assertEquals(1, cardInterest.intValue());
    }

    @Test
    public void calculateVisaInterestTest() throws Exception
    {
        Double cardInterest = interestRateCalculator.calculateCardInterest("Visa");
        assertEquals(10, cardInterest.intValue());
    }
}
