package com.cognizant.truYum.Dao;

import java.util.List;

import com.cognizant.truYum.model.MenuItem;
import com.cognizant.truYum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {
   static MenuItemDao menudao = new MenuItemDaoCollectionImpl();

    public static void main(String[] args) {
        testGetMenuItemListAdmin();
        testGetMenuItemListCustomer();
        testModifyMenuItem();
        testGetMenuItemListAdmin();
        testGetMenuItem();
    }

    public static void testGetMenuItemListAdmin() {
        System.out.println("Admin View");
        List<MenuItem> menu = menudao.getMenuItemListAdmin();
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%s\n", "Id", "Name", "Price", "Active",
                "Date Of Launch", "Category", "Free Delivery");
        for (MenuItem menuItem : menu) {
            System.out.println(menuItem);

        }
    }

    public static void testGetMenuItemListCustomer() {
        System.out.println("Customer View");
        List<MenuItem> menuItem = menudao.getMenuItemListCustomer();
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%s\n", "Id", "Name", "Price", "Active",
                "Date Of Launch", "Category", "Free Delivery");
        for (MenuItem menuItem2 : menuItem) {
            System.out.println(menuItem2);

        }

    }

    public static void testModifyMenuItem() {
        System.out.println("Modify Menu Item");
        MenuItem menuitem = new MenuItem(1, "Eat and Enjoy", 12345.0f, true,
                DateUtil.convertToDate("02/01/2020"), "Main Dish", false);
        menudao.modifyMenuItem(menuitem);

    }

    public static void testGetMenuItem() {
        System.out.println("Get Menu Item");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%s\n", "Id", "Name", "Price", "Active",
                "Date Of Launch", "Category", "Free Delivery");
        MenuItem menuitem = menudao.getMenuItem(3);
        System.out.println(menuitem);

    }
}