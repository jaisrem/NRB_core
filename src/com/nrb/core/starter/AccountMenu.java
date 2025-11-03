package com.nrb.core.starter;

import com.nrb.core.functions.AccountFunctions;
import com.nrb.core.model.Account;
import com.nrb.core.utils.FileUtils;

import java.io.FileNotFoundException;
import java.util.List;

public class AccountMenu extends AccountIO {

    AccountFunctions accountFunctions = new AccountFunctions();
    FileUtils fileUtils = new FileUtils();

    public AccountMenu() throws FileNotFoundException {
        Boolean status = Boolean.TRUE;
        List<Account> accountList = fileUtils.readAccountFile();

        while (status) {
            System.out.println("Welcome to NRB");
            System.out.println("1. Find sum of balances");
            System.out.println("2. Show Distinct Account Types");
            System.out.println("3. Show distinct account status");
            System.out.println("4. Exit");

            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    System.out.println("Show sum of balance");
                    float sumOfAccountBalance = accountFunctions.sumOfAccountBalance(accountList);
                    display("The sum of account balance is: " + sumOfAccountBalance);
                    break;
                case 2:
                    System.out.println("2. Show Distinct Account Types");
                    List<String> accountType = accountFunctions.findDistinctAccountType(accountList);
                    display("The Distinct account types is: " + accountType);
                    break;
                case 3:
                    System.out.println("3. Show distinct account status");
                    List<String> accountStatus = accountFunctions.findDistinctAccountStatus(accountList);
                    display("The Distinct account status is: " + accountStatus);
                    break;
                case 4:
                    status = Boolean.FALSE;
                    System.out.println("Thank you for using NRB");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }

}
