package com.bank.service;

import com.bank.entity.Account;
import com.bank.entity.User;
import com.bank.repository.AccountRepository;

import java.util.List;

public class UserService {

    AccountRepository accountRepository = new AccountRepository();

    /**
     * This method is used for add aadhar card number to provided account no
     *
     * @param accountNo
     * @param aadharCardNo
     */
    public void addAadharCardNo(int accountNo,String aadharCardNo){
        List<Account> accountList = accountRepository.getAllAccountList();
        System.out.println("try to find match account");
        for(Account account: accountList){
            System.out.println("try to match with account no : "+account.getAccountNo());
            if(account.getAccountNo()==accountNo){
                System.out.println("matched account found");
                account.getUser().setAadharCardNo(aadharCardNo);
                System.out.println("aadhar card added successfully");
                return;
            }
        }
    }
}
