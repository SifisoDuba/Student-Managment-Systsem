package org.example.Factory;

import org.example.Entity.Admin;
import org.example.Util.Helper;

public class AdminFactory {

    public static Admin createAdmin(String adminID, String adminName, String adminEmail, String adminRole) {

        if (Helper.isNullOrEmpty(adminID)
                || Helper.isNullOrEmpty(adminName)
                || Helper.isNullOrEmpty(adminEmail)
                || Helper.isNullOrEmpty(adminRole)
        ) {
            return null;

        }

        return new Admin.Builder()
            .setadminID(adminID)
            .setadminName(adminName)
            .setadminEmail(adminEmail)
            .setadminRole(adminRole)
            .build();


    }

}
