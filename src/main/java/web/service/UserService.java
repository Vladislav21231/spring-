package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUser(int id);

    void editUser(User user);

    User getUserById(int id);

    List<User> getAllUsers();
}
