package com.luna.service;

import com.luna.dao.UserDAO;
import com.luna.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by xuhao on 2017/5/30.
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public List<User> getUserList() {
        return userDAO.getUserList();
    }

    public User getUserById(UUID userId) {
        return userDAO.getUserById(userId);
    }
}
