package com.luna.dao;

import com.luna.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Created by xuhao on 2017/5/30.
 */
@Repository
public interface UserDAO {

    List<User> getUserList();
    User getUserById(UUID id);
    void addUser(User user);
}
