<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 06.11.18
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cart</title>
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

</head>
<body>

<h1>Edit cart</h1>

<form:form method="post"
           modelAttribute="cart">


    Part : <form:input path="partName" readonly="true"/><br>
    Price: <form:input path="partPrice" readonly="true"/><br>
    Quantity: <form:input path="cartQuantity"/><br>
    <input type="submit" value="Save" >
</form:form>


</body>
</html>
