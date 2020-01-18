package com.cognizant.truYum.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truYum.dao.MenuItemDao;
import com.cognizant.truYum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truYum.model.MenuItem;

@WebServlet("/ShowEditMenuItem")
public class ShowEditMenuItemServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        long menuItemId = Long.parseLong(request.getParameter("menuItemId"));
        MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
        MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
        request.setAttribute("menuItem", menuItem);
        request.getRequestDispatcher("edit-menu-item.jsp").forward(request, response);
    }

}
