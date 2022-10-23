package com.example.youtubeca.dao;

import com.example.youtubeca.model.Quote;
import com.example.youtubeca.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public List<User> getUsers() {
        if(jdbcTemplate==null)
            return new ArrayList<>();
        return jdbcTemplate.query("select * from users", (rs, rowNum) -> {
            var user=new User();
            user.setEmail(rs.getString("Email"));
            user.setUserName(rs.getString("userName"));
            user.setPassword(rs.getString("Password"));
            return user;
        });
    }

    public List<Quote> getQuotes(){
        if(jdbcTemplate==null)
            return new ArrayList<>();
        return jdbcTemplate.query("select * from quotes", (rs, rowNum) -> {
            var quote=new Quote();
            quote.setQuote(rs.getString("quote"));
            quote.setAnime(rs.getString("anime"));
            quote.setCharacter(rs.getString("character"));
            quote.setImageUrl(rs.getString("url"));
            return quote;
        });
    }

}
