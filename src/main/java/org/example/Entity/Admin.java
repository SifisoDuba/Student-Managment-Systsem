package org.example.Entity;

public class Admin {

    private String adminID;
    private String adminName;
    private String adminEmail;
    private String adminRole;

    private Admin(){

    }

    private Admin(String adminID, String adminName, String adminEmail, String adminRole) {
        this.adminID = adminID;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminRole = adminRole;
    }

    public String getadminID() {
        return adminID;
    }

    public String getadminName() {
        return adminName;
    }

    public String getadminEmail() {
        return adminEmail;
    }

    public String getadminRole() {
        return adminRole;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminRole='" + adminRole + '\'' +
                '}';
    }

    public static class Builder {

        private String adminID;
        private String adminName;
        private String adminEmail;
        private String adminRole;

        public Builder(){

        }

        public Builder(String adminId, String adminName, String adminEmail, String adminRole) {
            this.adminID = adminId;
            this.adminName = adminName;
            this.adminEmail = adminEmail;
            this.adminRole = adminRole;
        }

        public Builder setadminID(String adminID) {
            this.adminID = adminID;
            return this;
        }

        public Builder setadminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        public Builder setadminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            return this;
        }

        public Builder setadminRole(String adminRole) {
            this.adminRole = adminRole;
            return this;
        }

        public Admin build(){
            return new Admin(adminID, adminName, adminEmail, adminRole);
        }
    }
}
