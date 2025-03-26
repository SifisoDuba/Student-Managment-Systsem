package org.example.Util;

public class Helper {

    // Check if a string is null or empty
    public static boolean isNullOrEmpty(String value) {
        return (value == null || value.trim().isEmpty());
    }

    // Email validation: must contain "@" and "."
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

}
