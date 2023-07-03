package com.ohgiraffers.layered.menu.domain.repository;

import com.ohgiraffers.layered.menu.domain.aggregate.entity.Menu;

import java.util.List;

public interface Repository<T> {

    void save(Menu menu);

    int count();

    List<T> findAll();

}
