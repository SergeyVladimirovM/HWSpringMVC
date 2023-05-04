<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: serge
  Date: 04.05.2023
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
    <h2>Add Product</h2>
    <c:url value="/addProduct" var="var"/>
<form action="${var}" method="post">
    <label for="title">Title</label>
    <input type="text" name="title" id="title">
    <label for="cost">Cost</label>
    <input type="text" name="cost" id="cost">
    <input type="submit" value="Add product">
    </form>
</body>
</html>
