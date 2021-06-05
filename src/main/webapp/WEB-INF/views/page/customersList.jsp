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
<h1>Customers list</h1>

<form:form method="post"
           modelAttribute="customer">

<table border="2" >
    <tr>
        <th >Name</th>
        <th >Surname</th>
        <th >City</th>
        <th >Street</th>
        <th >Phone Number</th>
        <th >Email</th>
        <th >Additional information</th>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.surname}</td>
            <td>${customer.city}</td></td>
            <td>${customer.street}</td></td>
            <td>${customer.phoneNumber}</td></td>
            <td>${customer.email}</td></td>
            <td>${customer.additionalInfo}</td></td>
            <td><a href="/admin/edit/${customer.id}">EDIT</a></td>
            <td><a href="/admin/delete/${customer.id}">DELETE</a></td>

        </tr>
        <%--<br>--%>
    </c:forEach>

</table>
</form:form>
</body>
</html>
