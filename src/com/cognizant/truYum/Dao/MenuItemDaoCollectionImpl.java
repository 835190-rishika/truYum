package com.cognizant.truYum.Dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truYum.model.MenuItem;
import com.cognizant.truYum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
    private static List<MenuItem> menuItemList;

    public MenuItemDaoCollectionImpl() {
        if (menuItemList == null || menuItemList.isEmpty()) {
            MenuItem item1 = new MenuItem(1, "Sandwitch", 99.00f, true,
                    DateUtil.convertToDate("15/03/2017"), "Main Course", true);
            MenuItem item2 = new MenuItem(1, "Burger", 129.00f, true,
                    DateUtil.convertToDate("23/12/2017"), "Main Course", false);
            MenuItem item3 = new MenuItem(1, "Pizza", 149.00f, true,
                    DateUtil.convertToDate("21/08/2018"), "Main Course", false);
            MenuItem item4 = new MenuItem(1, "Frenchfries", 57.00f, true,
                    DateUtil.convertToDate("02/07/2017"), "Starters", true);
            MenuItem item5 = new MenuItem(1, "Chocolate Brownie", 32.00f, true,
                    DateUtil.convertToDate("02/11/2022"), "Dessert", true);
            menuItemList = new ArrayList<MenuItem>();
            menuItemList.add(item1);
            menuItemList.add(item2);
            menuItemList.add(item3);
            menuItemList.add(item4);
            menuItemList.add(item5);

        }
    }

    @Override
    public List<MenuItem> getMenuItemListAdmin() {
        // TODO Auto-generated method stub
        return menuItemList;
    }

    @Override
    public List<MenuItem> getMenuItemListCustomer() {
        ArrayList<MenuItem>menuItems=new ArrayList<MenuItem>();
        for (MenuItem menuItem : menuItemList) {
            if((menuItem.getDateOfLaunch().before(new Date())
                    ||menuItem.getDateOfLaunch().equals(new Date()))
                    &&menuItem.isActive()==true){menuItems.add(menuItem);
            }  
        }
        return menuItems;
    }

    @Override
    public void modifyMenuItem(MenuItem menuitem) {
        // TODO Auto-generated method stub

    }

    @Override
    public MenuItem getMenuItem(long menuItemId) {
        // TODO Auto-generated method stub
        return null;
    }
}