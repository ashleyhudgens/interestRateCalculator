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
        //set up for case one wallet one
        Wallet caseOneWalletOne = new Wallet(1);
        interestRatePerPersonCaseOne = caseOneWalletOne.interestRatePerWalletCaseOne;

        //set up for case two wallet one
        Wallet caseTwoWalletOne = new Wallet(1);
        interestRatePerPersonCaseTwo = caseTwoWalletOne.interestRatePerWalletCaseTwoWalletOne + caseTwoWalletOne.interestRatePerWalletCaseTwoWalletTwo;

        //set up for case two wallet two
        Wallet caseTwoWalletTwo = new Wallet(1);
        interestRatePerPersonCaseTwo = caseTwoWalletTwo.interestRatePerWalletCaseTwoWalletTwo;

        Wallet caseThreeWalletOne = new Wallet(1);

        Wallet caseThreeWalletTwo = new Wallet(1);



        interestRatePerPersonCaseThreePersonOne = caseThreeWalletOne.interestRatePerWalletCaseThreeWalletOne;

        interestRatePerPersonCaseThreePersonTwo = caseThreeWalletTwo.getInterestRatePerWalletCaseThreeWalletTwo;
    }
}
