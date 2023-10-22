package app;

import interface_adapter.ViewManagerModel;
import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearPresenter;
import interface_adapter.clear_users.ClearViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInteractor;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;

import javax.swing.*;
import java.io.IOException;

public class ClearUseCaseFactory {
    private ClearUseCaseFactory() {}

    public static ClearController createUserClearUseCase (
            ViewManagerModel viewManagerModel,
            ClearViewModel clearViewModel,
            SignupViewModel signupViewModel,
            ClearUserDataAccessInterface userDataAccessObject) {
        ClearOutputBoundary clearOutputBoundary = new ClearPresenter(clearViewModel, signupViewModel, viewManagerModel);
        ClearInputBoundary clearInteractor = new ClearInteractor(userDataAccessObject, clearOutputBoundary);
        return new ClearController(clearInteractor);
    }
}
