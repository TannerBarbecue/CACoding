package use_case.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;
import entity.CommonUserFactory;
import view.SignupView;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClearInteractor implements ClearInputBoundary{

    final FileUserDataAccessObject userDataAccessObject;

    public ClearInteractor() {
        try {
            userDataAccessObject = new FileUserDataAccessObject("./users.csv", new CommonUserFactory());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void execute(SignupView view) throws FileNotFoundException {
        JOptionPane.showMessageDialog(view, userDataAccessObject.getUsers());
        userDataAccessObject.clear();
        //ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.getUsers());

    }
}
