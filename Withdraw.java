public class Withdraw {
    public int withdrawAmount(int balance,int amount)
    {
        if(amount<balance)
        {
            return balance-amount;
        }
        return 0;
    }
}
