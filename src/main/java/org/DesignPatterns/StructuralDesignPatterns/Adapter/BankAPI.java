package org.DesignPatterns.StructuralDesignPatterns.Adapter;

public interface BankAPI {
    public void transfer(int fromAccountNumber, int toAccountNumber, int amount);
    public void checkBalance(int accountNumber);
    public void deposit(int accountNumber, int amount);
    public void withdraw(int accountNumber, int amount);
}
