package com.zzkun.dao;

import com.zzkun.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManagerDao extends JpaRepository<Manager, Integer> {
    @Override
    List<Manager> findAll();

    @Override
    <S extends Manager> S save(S s);

    @Override
    Manager findOne(Integer integer);

    @Override
    long count();
}
