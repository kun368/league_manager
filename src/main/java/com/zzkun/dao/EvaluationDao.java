package com.zzkun.dao;

import com.zzkun.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvaluationDao extends JpaRepository<Evaluation, Integer> {
    @Override
    List<Evaluation> findAll();

    @Override
    void deleteAllInBatch();

    @Override
    <S extends Evaluation> S save(S s);

    @Override
    Evaluation findOne(Integer integer);

    @Override
    long count();
}
