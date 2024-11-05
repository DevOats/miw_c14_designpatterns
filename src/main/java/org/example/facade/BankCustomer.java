package org.example.facade;

import org.example.facade.banksytem.WithdrawalFacade;

public class BankCustomer {



    public void iWantMyMoney(){

        WithdrawalFacade atm = new WithdrawalFacade();


        int amount = atm.withdrawMoneyForCustomer(50, "pietje", "pietje123!");

        if(amount > 0){
            // Yaaay bier!
        }

    }


}
