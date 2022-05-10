package application;
import entitie.Account;
import entitie.BusinessAccount;
import entitie.SavingsAccount;

public class TestAccount extends BusinessAccount {
    public TestAccount() {
    }
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // Testando Sobreposição, Herança e Up/Down Casting

        Account accX = new Account(1001, "Alex", 1000.0);
        accX.withdraw(200.0);
        System.out.println(accX.getBalance());

        Account accY = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        accY.withdraw(200.0);
        System.out.println(accY.getBalance());

        Account accZ = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        accZ.withdraw(200.0);
        System.out.println(accZ.getBalance());
    }
}
