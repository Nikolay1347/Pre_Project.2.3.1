package hiberweb.service;

import hiberweb.model.User;

import java.util.List;

public interface UserService {
    void add (User user);

    List<User> listUsers();

    void update(User user);

    void delete (long id);
}
