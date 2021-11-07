package ru.smal.service;

import org.hibernate.SessionFactory;
import ru.smal.dao.Dao;
import ru.smal.dao.impl.UserDaoImpl;
import ru.smal.model.User;

import java.util.List;

public class UserService {
    private final Dao<User, Integer> userDao;

    public UserService(SessionFactory factory) {
        this.userDao = new UserDaoImpl(factory);
    }

    public User findById(int id) {
        return userDao.findById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public boolean save(User user) {
        return userDao.save(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }
}
