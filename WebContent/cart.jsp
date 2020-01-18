<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>cart</title>
<link rel="shortcut icon" href="images\truyum-logo-light.png">
<link rel="stylesheet" href="styles/style.css">
</head>
<body link="blue">
    <div class="fixed-header">
        <div class="container">
            &nbsp;&nbsp;truYum&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images\truyum-logo-light.png"
                height=25 width=25>
        </div>
        <div class="nav">
            <a href="ShowMenuItemListCustomer">Menu</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="ShowCart">Cart</a>
        </div>
    </div>



    <c:set var="cart" value="${cart}"></c:set>
    <h1>Cart</h1>
    <c:if test="${removeCartItemStatus==true }">
        <h4 style="color: #0b8038" id="remove-cart1" class="edit">Item Removed from Cart
            Successfully</h4>
    </c:if>
    <table id="table2">
        <col width="200px" />
        <col width="100px" />
        <col width="90px" />


        <tr>
            <th align="left">Name</th>
            <th align="left">Free Delivery</th>
            <th align="right">Price</th>

        </tr>
        <c:forEach items="${menuItem}" var="menuItem">
            <tr>
                <td>${menuItem.getName()}</td>
                <td align="left"><c:choose>
                        <c:when test="${menuItem.isFreeDelivery()==true}">Yes</c:when>
                        <c:otherwise>No</c:otherwise>
                    </c:choose></td>
                <td align="right"><f:formatNumber type="currency" currencySymbol="Rs."
                        minFractionDigits="2" value="${menuItem.getPrice()}"></f:formatNumber></td>

                <td align="right"><a href="RemoveCart?menuItemId=${menuItem.getId()}">Delete</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td></td>
            <td align="left"><b>Total</b></td>
            <td align="right" id="amount"><b>Rs.${cart.getTotal()}</b></td>
        </tr>
        </div>
    </table>

    <div class="fixed-footer">
        <div>Copyright&copy2019</div>
    </div>
</body>
</html>
