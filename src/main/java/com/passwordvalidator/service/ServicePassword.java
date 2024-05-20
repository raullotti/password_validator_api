package com.passwordvalidator.service;

import java.util.regex.*;

public class ServicePassword {
 
    public static boolean isValid(String password) {

        if (password == null || password.length() < 9) return false;

        if (!Pattern.compile("\\d").matcher(password).find()) return false;

        if (!Pattern.compile("[a-z]").matcher(password).find()) return false;

        if (!Pattern.compile("[A-Z]").matcher(password).find()) return false;

        if (!Pattern.compile("[!@#$%^&*()\\-+]").matcher(password).find()) return false;

        if (Pattern.compile("(.).*\\1").matcher(password).find()) return false;
        
        return true;

    }
}
