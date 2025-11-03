package com.nrb.core.functions;

import com.nrb.core.model.Account;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AccountFunctions {
    public Float sumOfAccountBalance(List<Account> accountList) {
        float accBalance = 0.0f;
        for (Account account : accountList) {
            accBalance += account.getBalance();
        }
        return accBalance;
    }

    public List<String> findDistinctAccountType(List<Account> accountType) {
        Set<String> accountTypeSet = new HashSet<>();
        for (Account account : accountType) {
            accountTypeSet.add(account.getAccountType());
        }
        return accountTypeSet.stream().toList();
    }

    public List<String> findDistinctAccountStatus(List<Account> accountStatus) {
        Set<String> accountStatusList = new HashSet<>();
        for (Account account : accountStatus) {
            accountStatusList.add(account.getStatus());
        }
        return accountStatusList.stream().toList();
    }
}
