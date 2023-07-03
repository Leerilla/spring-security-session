package com.ohgiraffers.layered.menu.domain.aggregate.entity;

public class Category {

    private Integer categoryCode;
    private String categoryName;
    private Integer refCategoryCode;

    public Category(Integer categoryCode, String categoryName, Integer refCategoryCode) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refCategoryCode = refCategoryCode;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }
}
