package com.bank.repository;

import com.bank.entity.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Used this layer for the database connection
 *
 */
public class AccountRepository {

    public static List<Account> accountList = new ArrayList<>();

    public void saveAccount(Account account){
        System.out.println("start saving account into db");
        accountList.add(account);
        //TODO: add db query here and excute query
        System.out.println("account saved succesfully in db");
    }

    public List<Account> getAllAccountList(){
        System.out.println("stat fetching all accounts from db");
        List<Account> accounts = accountList;
        System.out.println("all accounts fetched successfully from db");
        return accounts;
    }
}
