package use_case.clear_users;

// TODO Complete me

import view.SignupView;

import java.io.FileNotFoundException;

public interface ClearInputBoundary {

    void execute(SignupView view) throws FileNotFoundException;
}
