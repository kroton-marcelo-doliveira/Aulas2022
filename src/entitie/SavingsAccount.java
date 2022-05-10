package entitie;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // Compilador: identifica a sobreposição
    // final: não deixa o método ser sobreposto ou a classe ser herdada
    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }
}
