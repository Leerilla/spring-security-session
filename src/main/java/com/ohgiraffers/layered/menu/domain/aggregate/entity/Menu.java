package com.ohgiraffers.layered.menu.domain.aggregate.entity;

import com.ohgiraffers.layered.menu.domain.aggregate.enumtype.OrderableStatus;
import com.ohgiraffers.layered.menu.domain.aggregate.vo.Money;

public class Menu {

    private Integer menuCode;
    private String menuName;
    private Money price;
    private Category category;
    private OrderableStatus orderableStatus;

    public Menu(String menuName, Money price, Category category, OrderableStatus orderableStatus) {
        this.menuName = menuName;
        this.price = price;
        this.category = category;
        this.orderableStatus = orderableStatus;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public Money getPrice() {
        return this.price;
    }

    public Category getCategory() {
        return this.category;
    }

    public OrderableStatus getOrderableStatus() {
        return orderableStatus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", orderableStatus=" + orderableStatus +
                '}';
    }
}
