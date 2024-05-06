package com.crudapp.crudApp.services;

/**
 * @author Anil Kumara
 * @version 1.0
 * @email anilsince99@gmail.com
 * @since 06/05/24
 */


import com.crudapp.crudApp.model.User;

import java.util.List;



public interface UserService {

    public List<User> getUsers();

    public User getUser(long userId);

    public User addUser(User user);

    public User updateUser(User user);

    public User deleteUser(long userId);
}
