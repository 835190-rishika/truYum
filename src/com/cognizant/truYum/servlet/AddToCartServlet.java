package com.cognizant.truYum.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truYum.dao.CartDao;
import com.cognizant.truYum.dao.CartDaoCollectionImpl;
import com.cognizant.truYum.dao.MenuItemDao;
import com.cognizant.truYum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truYum.model.MenuItem;

@WebServlet("/AddToCart")
public class AddToCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long menuItemID = Long.parseLong(request.getParameter("menuItemId"));
        long userId = 1L;
        CartDao cartDao = new CartDaoCollectionImpl();
        cartDao.addCartItem(userId, menuItemID);
        MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
        List<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();
        request.setAttribute("addCartStatus", true);
        request.setAttribute("menuItem", menuItemList);
        request.getRequestDispatcher("menu-item-list-customer.jsp").forward(request, response);
    }

}
