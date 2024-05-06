package com.crudapp.crudApp.services;

import com.crudapp.crudApp.dao.UserDao;
import com.crudapp.crudApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anil Kumara
 * @version 1.0
 * @email anilsince99@gmail.com
 * @since 06/05/24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUser(long userId) {
        return userDao.findById(userId).get();
    }

    @Override
    public User addUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public User deleteUser(long userId) {
        User user = userDao.findById(userId).get();
        userDao.delete(user);
        return user;
    }

}