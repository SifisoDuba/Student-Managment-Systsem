package org.example.Util;

public class Helper {


    public static boolean isNullOrEmpty(String value) {
        return (value == null || value.trim().isEmpty());
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

}
