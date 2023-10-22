package interface_adapter.clear_users;

// TODO Check
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

public class ClearController {

    final ClearInputBoundary clearInputInteractor;
    public ClearController(ClearInputBoundary clearInputInteractor) {
        this.clearInputInteractor = clearInputInteractor;
    }

    public void execute() {
        clearInputInteractor.execute();
    }

}
