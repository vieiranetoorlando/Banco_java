package application.entities;

public class Account {

    private int number;
    private String name;
    private double balance;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double valor) {
        balance += valor;
    }
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Conta "
                + number
                + ", Titular: "
                + name
                + ", Saldo: $ "
                + String.format("%.2f", balance);
    }

}