package com.example.youtubeca.controller;

import com.example.youtubeca.dao.UserDao;
import com.example.youtubeca.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/")
    public List<Quote> getQuotes(){
        return userDao.getQuotes();
    }

}
