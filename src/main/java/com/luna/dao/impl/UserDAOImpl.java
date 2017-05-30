package com.luna.dao.impl;

import com.luna.dao.UserDAO;
import com.luna.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.activation.MimeType;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

/**
 * Created by xuhao on 2017/5/30.
 */
@Repository
public class UserDAOImpl implements UserDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getUserList() {
        List<User> userlist;
        String sql = "select * from users";
        userlist = jdbcTemplate.query(sql, new UserRowMapper());
        return userlist;
    }

    //通过用户id获取用户列表，其实这里只有一条数据
    public User getUserById(UUID id){
        String sql="select * from users where user_id=?";
        return jdbcTemplate.query(sql, new Object[]{id},new UserRowMapper()).get(0);
    }

    //添加用户
    public void addUser(User user) {
        String sql = "insert into users(user_id, nick_name, sex, age, height, head_portrait, email) values(?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{user.getUserId(), user.getNickName(), user.getSex(),
                user.getAge(), user.getHeight(), user.getHeadPortrait(), user.getEmail()});

    }

    class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int i) throws SQLException {
            User user = new User();
            user.setUserId(UUID.fromString(rs.getString("user_id")));
            user.setNickName(rs.getString("nick_name"));
            user.setSex(rs.getString("sex"));
            user.setAge(rs.getInt("age"));
            user.setHeight(rs.getInt("height"));
            user.setHeadPortrait(rs.getString("head_portrait"));
            user.setEmail(rs.getString("email"));
            return user;
        }
    }
}
