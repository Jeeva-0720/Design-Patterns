package org.DesignPatterns.StructuralDesignPatterns.Adapter;

public class PhonePe {
    private static BankAPI bankAPI = new YesBankAdapter();

    public static void main(String[] args) {
        bankAPI.transfer(12345, 45678, 100);
    }


}
