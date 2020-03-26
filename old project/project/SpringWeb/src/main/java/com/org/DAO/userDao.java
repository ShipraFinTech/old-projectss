package com.org.DAO;

import com.org.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by shipra on 11/1/18.
 */

public class userDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate jdbcTemplate) {
        this.template = jdbcTemplate;
    }

    public int save(User user) {
        String sql = "insert into User(username,password)" +
                "VALUES(" + user.getUsername() + "," + user.getPassword() + ")";
        return template.update(sql);
    }
}