<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
</head>
<body>
<h1>Register</h1>

<form:form method="post"
           modelAttribute="registerDto">

    Login:<form:input path="login" /><br>
    Email:<form:input path="email" /><br>
    Password:<form:password path="password" /><br>
    Repeat password:<form:password path="passwordRepeat" /><br>

    <input type="submit" value="Register">
</form:form>

</body>
</html>
