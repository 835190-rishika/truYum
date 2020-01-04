package com.cognizant.truYum.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    private long id;
    private String name;
    private float price;
    private boolean active;
    private Date dateOfLaunch;
    private String category;
    private boolean freeDelivery;

    public MenuItem() {
        // TODO Auto-generated constructor stub
    }

    public MenuItem(long id, String name, float price, boolean active, Date dateOfLaunch,
            String category, boolean freeDelivery) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.active = active;
        this.dateOfLaunch = dateOfLaunch;
        this.category = category;
        this.freeDelivery = freeDelivery;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getDateOfLaunch() {
        return dateOfLaunch;
    }

    public void setDateOfLaunch(Date dateOfLaunch) {
        this.dateOfLaunch = dateOfLaunch;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isFreeDelivery() {
        return freeDelivery;
    }

    public void setFreeDelivery(boolean freeDelivery) {
        this.freeDelivery = freeDelivery;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%-10s%-20s%-15s%-20s%-20s%-20s%s", id, name, price,
                active == true ? "yes" : "No", sdf.format(dateOfLaunch), category,
                freeDelivery == true ? "Yes" : "No");
    }

}
