class Person
{

    double interestRatePerPersonCaseOne = 0;
    double interestRatePerPersonCaseTwo = 0;
    double interestRatePerPersonCaseThreePersonOne = 0;
    double interestRatePerPersonCaseThreePersonTwo = 0;

    Person()
    {
        //constructor
    }

    Person(int numberOfPeople)
    {
        //set up for case one person one
        Wallet caseOneWalletOne = new Wallet(1);
        interestRatePerPersonCaseOne = caseOneWalletOne.interestRatePerWalletCaseOne;

        //set up for case two person one
        Wallet caseTwoWalletOne = new Wallet(1);
        Wallet caseTwoWalletTwo = new Wallet(1);
        interestRatePerPersonCaseTwo = caseTwoWalletOne.interestRatePerWalletCaseTwoWalletOne + caseTwoWalletTwo.interestRatePerWalletCaseTwoWalletTwo;

        //set up for case three person one
        Wallet caseThreeWalletOne = new Wallet(1);
        interestRatePerPersonCaseThreePersonOne = caseThreeWalletOne.interestRatePerWalletCaseThreeWalletOne;

        //set up for case three person two
        Wallet caseThreeWalletTwo = new Wallet(1);
        interestRatePerPersonCaseThreePersonTwo = caseThreeWalletTwo.getInterestRatePerWalletCaseThreeWalletTwo;
    }
}
