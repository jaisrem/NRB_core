package com.nrb.core.utils;

import com.nrb.core.model.Account;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
    DateUtils dateUtils = new DateUtils();

    public List<Account> readAccountFile() throws FileNotFoundException {
        try {
            List<Account> accountList = new ArrayList<>();
            String filePath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "account_data.txt";
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            int count = 1;

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] tokens = line.split("\t");

                if (count++ != 1) {
                    Account account = new Account();
                    account.setId(tokens[0]);
                    account.setAccountType(tokens[1]);
                    account.setBalance(Float.parseFloat(tokens[2]));
                    account.setAccountOpenedDate(dateUtils.getDateFromString(tokens[3]));
                    account.setStatus(tokens[4]);
                    accountList.add(account);

                }
            }
            return accountList;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.out.println("File not found");

        }
        return new ArrayList<>();
    }
}
