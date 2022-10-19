public class FixedDepositAccount extends Accounts{
    int years;
    FixedDepositAccount(String name,int accountNumber,int balance,int years)
    {
        super(name,accountNumber,balance);
        this.years=years;
    }

}
