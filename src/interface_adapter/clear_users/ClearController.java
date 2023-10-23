package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInteractor;
import view.SignupView;

import java.io.FileNotFoundException;

public class ClearController {

    final ClearInteractor clearInteractor;
    public ClearController() {
        this.clearInteractor = new ClearInteractor();
    }

    public void execute(SignupView view) throws FileNotFoundException {
        clearInteractor.execute(view);
    }
}
