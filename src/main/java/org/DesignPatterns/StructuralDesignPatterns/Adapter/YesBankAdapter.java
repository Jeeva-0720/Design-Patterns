package org.DesignPatterns.StructuralDesignPatterns.Adapter;

import org.DesignPatterns.StructuralDesignPatterns.Adapter.ThirdParty.YesBank;

public class YesBankAdapter implements BankAPI {

    private YesBank yesBank = new YesBank();

    @Override
    public void transfer(int fromAccountNumber, int toAccountNumber, int amount) {
        yesBank.transfer(fromAccountNumber, toAccountNumber, amount);
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
