<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>Available parts</h1>



<table border="2" >
    <tr>
        <th >Name</th>
        <th >Quantity</th>
        <th >Price</th>
        <th >Add product&nbsp;</th>
    </tr>
    <c:forEach items="${parts}" var="part">
        <tr>
        <td>${part.partName}</td>  <td>${part.partQuantity}</td>  <td>${part.partPrice}</td>
            <td><a href="/main/add/${part.id}">Add to cart</a></td>
        </tr>
        <%--<br>--%>
    </c:forEach>

</table>
<br><br>
<h3><a href="/main/allincart">Go to shopping cart</a></h3>
</body>
</html>
