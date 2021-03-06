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
import com.cognizant.truYum.dao.CartEmptyException;
import com.cognizant.truYum.model.Cart;
import com.cognizant.truYum.model.MenuItem;

@WebServlet("/RemoveCart")
public class RemoveCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            long userId = 1L;
            long menuItemId = Long.parseLong(request.getParameter("menuItemId"));
            CartDao cartDao = new CartDaoCollectionImpl();
            cartDao.removeCartItem(userId, menuItemId);
            Cart cart = cartDao.getAllCartItems(userId);
            List<MenuItem> menuItemList = cart.getMenuItemList();
            double price = 0.0;
            for (MenuItem menuItem : menuItemList) {
                price = price + menuItem.getPrice();
            }
            cart.setTotal(price);
            request.setAttribute("menuItem", menuItemList);
            request.setAttribute("cart", cart);
            request.setAttribute("removeCartItemStatus", true);
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        }

        catch (CartEmptyException e) {
            request.getRequestDispatcher("cart-empty.jsp").forward(request, response);
        }
    }

}
