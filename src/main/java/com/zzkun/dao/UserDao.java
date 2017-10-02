package com.zzkun.dao;

import com.zzkun.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();

    @Override
    <S extends User> S save(S s);

    @Override
    User findOne(Integer integer);

    @Override
    long count();


}
