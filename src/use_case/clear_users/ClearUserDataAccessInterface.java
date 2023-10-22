package use_case.clear_users;

// TODO check

import entity.User;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);

    String clear();

    User get(String username);
}
