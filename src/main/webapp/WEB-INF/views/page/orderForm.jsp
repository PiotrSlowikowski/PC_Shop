<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="color" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 09.11.18
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PC Shop</title>
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

</head>
<body>
<h1>Order form</h1>

<form:form method="post"
           modelAttribute="cart">

<table border="2" >
    <tr>
        <th >Name</th>
        <th >Price</th>
        <th >Quantity</th>
    </tr>
    <c:forEach var="cart" items="${carts}">
        <tr>
        <td>${cart.partName}</td>
            <td>${cart.partPrice}</td>
            <td>${cart.cartQuantity}</td>
        </tr>
    </c:forEach>

    <c:set var="sum" scope="page" value="0.0"/>
    <c:forEach var="cart" items="${carts}">
        <c:set var="sum" scope="page" value="${sum + cart.partPrice * cart.cartQuantity}" />
    </c:forEach>

    <td>Total price:</td>
    <td>${sum}</td>


</table>
<br>
    <h3><a href="/main/customerDataAdd">Confirm</a></h3>
</form:form>
</body>
</html>
