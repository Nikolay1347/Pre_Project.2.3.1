package hiberweb.service;

import hiberweb.model.User;

import java.util.List;

public interface UserService {
    void addUser (User user);

    List<User> getListUsers();

    void updateUser(User user);

    void deleteUser (long id);
}
