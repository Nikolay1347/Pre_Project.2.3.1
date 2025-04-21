package hiberweb.dao;

import hiberweb.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    List<User> getListUsers();

    void deleteUser(long id);
}
