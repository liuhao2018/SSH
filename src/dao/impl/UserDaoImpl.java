package dao.impl;

import dao.IUserDao;
import domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
public class UserDaoImpl extends HibernateDaoSupport implements IUserDao {
    @Override
    public void save(User user) {
        super.getHibernateTemplate().save(user);
        throw new RuntimeException("exception");
    }

    @Override
    public void delete(Long id) {
        User user = new User();
        user.setId(id);
        super.getHibernateTemplate().delete(id);
    }

    @Override
    public User get(Long id) {
        return super.getHibernateTemplate().get(User.class,id);
    }

    @Override
    public List<User> list() {
        String hql = "SELECT o FROM User o";
        return (List<User>) super.getHibernateTemplate().find(hql);
    }
}
