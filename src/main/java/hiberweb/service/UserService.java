package hiberweb.service;

import hiberweb.model.User;

import java.util.List;

public interface UserService {
    void add (User user);

    List<User> getListUsers();

    void update(User user);

    void delete (long id);
}
