package sem4.Bank;

import sem4.Account.Account;
import sem4.Account.InsufficientFundsException;
public class Transaction  {
    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Транзакция прошла успешно");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }


}