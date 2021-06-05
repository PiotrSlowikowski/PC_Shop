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
<h1>Shopping cart list</h1>

<form:form method="post"
           modelAttribute="cart">

<table border="2" >
    <tr>
        <th >Name</th>
        <th >Price</th>
        <th >Quantity</th>
        <th >Edit</th>
        <th >Delete</th>
    </tr>
    <c:forEach items="${carts}" var="cart">
        <tr>
            <td>${cart.partName}</td>
            <td>${cart.partPrice}</td>
            <td>${cart.cartQuantity}</td></td>
            <td><a href="/main/edit/${cart.id}">EDIT</a></td>
            <td><a href="/main/delete/${cart.id}">DELETE</a></td>

        </tr>
        <%--<br>--%>
    </c:forEach>

</table>
<br>
    <h3><a href="/main/orderForm">Order now!</a></h3>
</form:form>
</body>
</html>
