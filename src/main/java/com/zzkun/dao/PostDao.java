package com.zzkun.dao;

import com.zzkun.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostDao extends JpaRepository<Post, Integer> {
    @Override
    List<Post> findAll();

    @Override
    <S extends Post> S save(S s);

    @Override
    Post findOne(Integer integer);

    @Override
    long count();
}
