package com.cognizant.truYum.dao;

import java.util.List;

import com.cognizant.truYum.model.MenuItem;

public interface MenuItemDao {
    public List<MenuItem> getMenuItemListAdmin();

    public List<MenuItem> getMenuItemListCustomer();

    public void modifyMenuItem(MenuItem menuitem);

    public MenuItem getMenuItem(long menuItemId);

}
