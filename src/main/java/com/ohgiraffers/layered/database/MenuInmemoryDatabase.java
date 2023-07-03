package com.ohgiraffers.layered.database;

import com.ohgiraffers.layered.menu.domain.aggregate.entity.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuInmemoryDatabase {

    private static int sequence;
    private static final Map<Integer, Menu> menuMap = new HashMap<>();

    private MenuInmemoryDatabase() {}

    private static void nextSequence() {
        sequence++;
    }

    private static int getCurrSequence() {
        return sequence;
    }
    public static void save(Menu menu) {

        menuMap.put(getCurrSequence(), menu);
        nextSequence();
    }

    public static int count() {

        return menuMap.size();
    }

    public static <T> List<T> findAll() {

        return (List<T>) new ArrayList<>(menuMap.values());
    }

    public static <T> T findMenuByCode(Integer menuCode) {

        return (T) menuMap.get(menuCode);
    }
}
