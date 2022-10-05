package by.trucking.repository;

import by.trucking.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository {
    User save(User user);
    User edit(User user);
    User delete(User user);

    User getById(int id) throws SQLException;
    List<User> getUsers();
    List<User> getByLogin();
    List<User> getByRole();
}