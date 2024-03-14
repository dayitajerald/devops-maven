package com.dayita.log.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dayita.log.domain.Login;
import java.util.List;


@Repository
public interface LogRepo extends JpaRepository<Login,String>
{
Login findByUsernameAndPassword(String username, String password);

}
