package org.example.Factory;

import org.example.Entity.Admin;

public class AdminFactory {

    public static Admin createAdmin(String adminID, String adminName, String adminEmail, String adminRole) {

        /*if (Helper.isNullorEmpty(adminID)
                || Helper.isNullorEmpty(adminName)
                || Helper.isNullorEmpty(adminEmail)
                || Helper.isNullorEmpty(adminRole)
        ) {
            return null;

        }
*/
        return new Admin.Builder()
            .setadminID(adminID)
            .setadminName(adminName)
            .setadminEmail(adminEmail)
            .setadminRole(adminRole)
            .build();


    }

}
