package use_case.clear_users;

// TODO Check

import java.util.ArrayList;

public class ClearOutputData {
    private boolean useCaseFailed;
    private String usernames;

    public ClearOutputData(String usernames, boolean useCaseFailed) {
        this.usernames = usernames;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsernames() {
        return usernames;
    }
}
