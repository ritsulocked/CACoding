package interface_adapter.clear_users;

// TODO Check

public class ClearState {
    private String usernames = "";
    private String usernameError = null;

    public ClearState(ClearState copy){
        usernames = copy.usernames;
        usernameError = copy.usernameError;
    }

    public ClearState() {}

    public String getUsername() { return usernames; }

    public String getUsernameError() { return usernameError; }

    public void setUsername(String username) { this.usernames = username; }

    public void setUsernameError(String usernameError) { this.usernameError = usernameError; }
}
