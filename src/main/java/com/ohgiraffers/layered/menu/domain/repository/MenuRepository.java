package com.ohgiraffers.layered.menu.domain.repository;

public interface MenuRepository<T> extends Repository<T> {

    T findMenuByCode(Integer menuCode);
}
