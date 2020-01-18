package com.cognizant.truYum.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truYum.dao.MenuItemDao;
import com.cognizant.truYum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truYum.model.MenuItem;

@WebServlet("/ShowMenuItemListAdmin")
public class ShowMenuItemListAdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
        List<MenuItem> menuItemList = menuItemDao.getMenuItemListAdmin();
        request.setAttribute("menuItem", menuItemList);
        request.getRequestDispatcher("menu-item-list-admin.jsp").forward(request, response);

    }

}
