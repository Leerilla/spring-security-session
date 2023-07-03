package com.ohgiraffers.layered.menu.domain.repository;

public interface CategoryRepository<T> extends Repository<T> {

    T findCategoryByCode(Integer categoryCode);
}
