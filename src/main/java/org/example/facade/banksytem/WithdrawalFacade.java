package org.example.facade.banksytem;

public class WithdrawalFacade {


    public int withdrawMoneyForCustomer(int amount, String userName, String password){

        BankAuthenticator auth = new BankAuthenticator();
        BankCreditStorage creditManager = new BankCreditStorage();
        BankBusinessRules bRules = new BankBusinessRules();

        String token = auth.Authenticate(userName, password);

        if(token == null){
            return 0;
        }

        int currentCredit = creditManager.getCredit(token);
        boolean canWithdraw = bRules.canWithDraw(token, currentCredit, amount);

        if(!canWithdraw){
            return 0;
        }

        creditManager.changeCredit(token, amount);

        return amount;
    }

}
