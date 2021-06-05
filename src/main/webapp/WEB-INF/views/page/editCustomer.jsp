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
    <%--<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">--%>

</head>
<body>

<h1>Edit cart</h1>

<form:form method="post"
           modelAttribute="customer">


    Name: <form:input path="name" /><br>
    Surname: <form:input path="surname" /><br>
    City: <form:input path="city" /><br>
    Street: <form:input path="street" /><br>
    Phone number: <form:input path="phoneNumber" /><br>
    Email: <form:input path="email" /><br>
    Additional information: <form:input path="additionalInfo"/><br>
    <input type="submit" value="Save" >
</form:form>


</body>
</html>
