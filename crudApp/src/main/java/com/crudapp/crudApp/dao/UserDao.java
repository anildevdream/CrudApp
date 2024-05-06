package com.crudapp.crudApp.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.crudApp.model.User;

/**
 * @author Anil Kumara
 * @version 1.0
 * @email anilsince99@gmail.com
 * @since 06/05/24
 */


public interface UserDao extends JpaRepository<User, Long> {

}
