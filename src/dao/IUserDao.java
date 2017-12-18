package dao;

import domain.User;

import java.util.List;

public interface IUserDao {
    void save(User user);
    void delete(Long id);
    User get(Long id);
    List<User> list();
}
