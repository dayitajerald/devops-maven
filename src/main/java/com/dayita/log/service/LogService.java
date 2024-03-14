package com.dayita.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayita.log.domain.Login;
import com.dayita.log.repository.LogRepo;

@Service
public class LogService {
    @Autowired
    private LogRepo rep;

    public Login log(String username, String password){
            Login user = rep.findByUsernameAndPassword(username, password);
            return user;
    }

}
