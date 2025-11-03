package com.nrb.core.starter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AccountIO {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int readInt(String message) {
        try {
            System.out.println(message);
            return Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public void display(String message) {
        System.out.println(message);
    }
}
