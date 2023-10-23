package use_case.clear_users;

import java.io.FileNotFoundException;

public interface ClearUserDataAccessInterface {
    void clear() throws FileNotFoundException;

    String getUsers();
}
