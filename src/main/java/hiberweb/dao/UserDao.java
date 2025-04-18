package hiberweb.dao;

import hiberweb.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void update(User user);

    List<User> listUsers();

    void delete(long id);
}
