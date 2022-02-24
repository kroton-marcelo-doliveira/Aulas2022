package entitie;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        // para herdar logica do construtor da classe base: no caso super Classe Account
        super();
    }

    public BusinessAccount(Integer numeber, String holder, Double balance, Double loanLimit) {
        super(numeber, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit) {
            deposit(amount);
            balance += amount - 10.00;
        }
    }
}
