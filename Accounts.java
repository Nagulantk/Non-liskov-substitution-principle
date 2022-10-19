public class Accounts {
    String name;
    int balance;
    int accountNumber;
    Accounts(String name,int accountNumber,int balance)
    {
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    Withdraw withdraw;
    Deposit deposit;

}
