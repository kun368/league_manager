package com.zzkun.dao;

import com.zzkun.model.League;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeagueDao extends JpaRepository<League, Integer> {
    @Override
    List<League> findAll();

    @Override
    <S extends League> S save(S s);

    @Override
    League findOne(Integer integer);
}
