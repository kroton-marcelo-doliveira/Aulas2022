package entitie;

public class Account {
    private Integer numeber;
    private String holder;
    protected Double balance;

    public Account(){
    }

    public Account(Integer numeber, String holder, Double balance) {
        this.numeber = numeber;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumeber() {
        return numeber;
    }

    public void setNumeber(Integer numeber) {
        this.numeber = numeber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
