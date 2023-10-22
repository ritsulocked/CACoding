package interface_adapter.clear_users;

// TODO Check
import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import javax.swing.*;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private final SignupViewModel signupViewModel;
    private final ViewManagerModel viewManagerModel;

    public ClearPresenter(ClearViewModel clearViewModel,
                          SignupViewModel signupViewModel,
                          ViewManagerModel viewManagerModel) {
        this.clearViewModel = clearViewModel;
        this.signupViewModel = signupViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData usernames) {
        // On success, stay in the signup view
        JOptionPane.showMessageDialog(null, usernames.getUsernames());
    }
}
