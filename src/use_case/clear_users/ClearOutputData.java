package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private String[] users;

    public ClearOutputData(String[] users) {
        this.users = users;
    }

    public String getUsers() {
        String userString = "";
        for (String user : this.users) {
            userString = userString + "\n" + user;
        }
        return userString;
    }
}
