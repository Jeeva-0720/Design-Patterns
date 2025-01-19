package org.DesignPatterns.StructuralDesignPatterns.Adapter;


import org.DesignPatterns.StructuralDesignPatterns.Adapter.ThirdParty.ICICIBank;

public class ICICIBankAdapter implements BankAPI {

    private ICICIBank iciciBank = new ICICIBank();
    @Override
    public void transfer(int fromAccountNumber, int toAccountNumber, int amount) {
        iciciBank.transfer(fromAccountNumber, toAccountNumber, amount);
    }

    @Override
    public void checkBalance(int accountNumber) {

    }

    @Override
    public void deposit(int accountNumber, int amount) {

    }

    @Override
    public void withdraw(int accountNumber, int amount) {

    }
}
