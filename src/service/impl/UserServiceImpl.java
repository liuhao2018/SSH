package service.impl;

import dao.IUserDao;
import domain.User;
import service.IUserService;

import java.util.List;

/**
 * @author liuhao
 */
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(Long id) {
       userDao.delete(id);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> list() {
        return  userDao.list();
    }
}
