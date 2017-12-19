package dao;

import domain.User;

import java.util.List;

/**
 * @author liuhao
 */
public interface IUserDao {
    /**
     * 保存用户
     * @param user 需要保存的用户信息
     */
    void save(User user);

    /**
     * 删除用户
     * @param id 用户id
     */
    void delete(Long id);

    /**
     * 获取用户
     * @param id 用户id
     * @return 用户对象
     */
    User get(Long id);


    /**
     * 返回所有用户
     * @return 所有用户
     */
    List<User> list();
}
