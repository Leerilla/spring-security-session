package com.ohgiraffers.layered.menu.application.dto;

import com.ohgiraffers.layered.menu.domain.aggregate.enumtype.OrderableStatus;

public class RegistMenuInfoDTO {

    private Integer menuCode;
    private String menuName;
    private int price;
    private Integer category;
    private OrderableStatus orderableStatus;

    public RegistMenuInfoDTO() {
    }

    public RegistMenuInfoDTO(Integer menuCode, String menuName, int price, Integer category, OrderableStatus orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.price = price;
        this.category = category;
        this.orderableStatus = orderableStatus;
    }

    public Integer getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(Integer menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public OrderableStatus getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(OrderableStatus orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "RegistMenuInfoDTO{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", orderableStatus=" + orderableStatus +
                '}';
    }
}
