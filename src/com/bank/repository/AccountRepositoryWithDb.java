package com.bank.repository;

import com.bank.entity.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Used this layer for the database connection
 *
 */
public class AccountRepositoryWithDb {

    private String databaseUrl = "jdbc:mysql://localhost:3306/bankproject?user=root&password=9099";

    public static List<Account> accountList = new ArrayList<>();

    public void saveAccount(Account account){
        Connection connection = getConnection();
        if(connection==null){
            System.out.println("failed to connect with db");
            return;
        }
        try {

            PreparedStatement stmt = null;

            System.out.println("try to add user....");
            String createUserSqlQuery = "INSERT INTO user(firstName,lastName,type) values(?,?,?)";
            stmt = connection.prepareStatement(createUserSqlQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1,account.getUser().getFirstName());
            stmt.setString(2,account.getUser().getLastName());
            stmt.setString(3,account.getUser().getType());
            stmt.executeUpdate();
            ResultSet resultSet = stmt.getGeneratedKeys();

            int userId = resultSet.getInt(1);
            System.out.println("Generated user Id: "+userId);

            System.out.println("User added successfully");

            System.out.println("try to add account....");
            String createAccountSqlQuery = "Insert into account(accountType,userId) values(?,?)";
            stmt = connection.prepareStatement(createAccountSqlQuery);
            stmt.setString(1,account.getAccountType());
            stmt.setInt(2,userId);
            stmt.executeUpdate();

            System.out.println("Account added successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List<Account> getAllAccountList(){
        Connection connection = getConnection();
        if(connection==null){
            System.out.println("failed to connect with db");
            return null;
        }
        try {
            String fetchAllAccountQuery = "select * from account";
            PreparedStatement stmt = connection.prepareStatement(fetchAllAccountQuery);
            stmt.executeQuery();
            ResultSet resultSet = stmt.getResultSet();

            List<Account> accountList = new ArrayList<>();
            if(resultSet!=null){
                while(resultSet.next()){
                    Account account = new Account();
                    //data put into result set to account
                    account.setAccountNo(resultSet.getInt(1));
                    account.setAccountType(resultSet.getString(2));

                    // put account into account list
                    accountList.add(account);
                }
            }
            return accountList;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    private Connection getConnection(){
        try{
            System.out.println("Try to connect with database....");
            Connection connection = DriverManager.getConnection(databaseUrl);
            System.out.println("Connected with database successfully");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return null;
    }

}
