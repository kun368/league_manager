package com.zzkun.dao;

import com.zzkun.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityDao extends JpaRepository<Activity, Integer> {
    @Override
    List<Activity> findAll();

    @Override
    <S extends Activity> List<S> save(Iterable<S> iterable);

    @Override
    <S extends Activity> S save(S s);

    @Override
    Activity findOne(Integer integer);

    @Override
    long count();
}
