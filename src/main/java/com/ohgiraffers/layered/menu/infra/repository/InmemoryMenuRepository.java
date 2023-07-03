package com.ohgiraffers.layered.menu.infra.repository;

import com.ohgiraffers.layered.database.MenuInmemoryDatabase;
import com.ohgiraffers.layered.menu.domain.aggregate.entity.Menu;
import com.ohgiraffers.layered.menu.domain.repository.MenuRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InmemoryMenuRepository<T> implements MenuRepository<T> {

    @Override
    public T findMenuByCode(Integer menuCode) {

        return MenuInmemoryDatabase.findMenuByCode(menuCode);
    }

    @Override
    public void save(Menu menu) {

        MenuInmemoryDatabase.save(menu);
    }

    @Override
    public int count() {

        return MenuInmemoryDatabase.count();
    }

    @Override
    public List<T> findAll() {

        return MenuInmemoryDatabase.findAll();
    }
}
