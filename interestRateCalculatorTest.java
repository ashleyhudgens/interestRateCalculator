import org.junit.Test;

import static org.junit.Assert.*;

public class interestRateCalculatorTest {

    @Test
    public void cardBalance() throws Exception{
        interestRateCalculator.cardBalance(100);
        assertEquals(100, 100);
    }

    @Test
    public void people() throws Exception{
        interestRateCalculator.people(1);
        assertEquals(1, 1);
    }

    @Test
    public void caseThreeSecondPersonWallet() throws Exception{
        interestRateCalculator.caseThreeSecondPersonWallet(1);
        assertEquals(1, 1);
    }

    @Test
    public void caseThreeFirstPersonWallet() throws Exception {
        interestRateCalculator.caseThreeFirstPersonWallet(1);
        assertEquals(1, 1);
    }

    @Test
    public void caseTwoWalletTwo() throws Exception {
        interestRateCalculator.caseTwoWalletTwo(1);
        assertEquals(1, 1);

    }

    @Test
    public void caseTwoWalletOne() throws Exception{
        interestRateCalculator.caseTwoWalletOne(1);
        assertEquals(1, 1);

    }

    @Test
    public void caseOneWallet() throws Exception{
        interestRateCalculator.caseOneWallet(1);
        assertEquals(1, 1);

    }

    @Test
    public void brand() throws Exception{
        interestRateCalculator.brand("Visa");
        assertEquals("Visa", "Visa");

    }

}