package com.cognizant.truYum.model;

import java.util.List;

import com.cognizant.truYum.model.MenuItem;

public class Cart {
    private List<MenuItem> menuItemList;
    private double total;

    public Cart() {
        // TODO Auto-generated constructor stub
    }

    public Cart(List<MenuItem> menuItemList, double total) {
        super();
        this.menuItemList = menuItemList;
        this.total = total;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String toString() {
        return "Cart [menuItemList=" + menuItemList + ", total=" + total + "]";
    }

}


