package com.bank.service;

import com.bank.entity.Account;
import com.bank.entity.User;
import com.bank.repository.AccountRepository;
import com.bank.repository.AccountRepositoryWithDb;


import java.util.List;

/**
 * Business logic layer
 *
 */
public class AccountService {

    private AccountRepository accountRepository = new AccountRepository();

    private AccountRepositoryWithDb accountRepositoryWithDb = new AccountRepositoryWithDb();

    /**
     * This method is used for create unique account
     *
     * @param userId
     * @param firstName
     * @param lastName
     * @param panCardNo
     * @param accountType
     * @return
     */
    public int createAccount(String firstName,String lastName,String panCardNo,String accountType){
        System.out.println("start creating account");
        User user = new User("CUSTOMER",firstName,lastName,panCardNo);
        Account account = new Account(user,accountType);
        accountRepositoryWithDb.saveAccount(account);
        System.out.println("account created successfully");
        System.out.println("account no: " + account.getAccountNo() + ", user type: " + account.getUser().getType() + ", user id: "+ account.getUser().getUserId());
        return account.getAccountNo();
    }

    public List<Account> getAllAccounts(){
        System.out.println("start fetching all accounts");
        List<Account> accountList = accountRepositoryWithDb.getAllAccountList();
        System.out.println("all fetched successfully");
        return accountList;
    }

    public List<Account> getAccountByUserId(int userId){

        return null;
    }
}
