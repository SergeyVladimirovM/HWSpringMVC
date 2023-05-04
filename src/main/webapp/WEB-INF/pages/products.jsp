<%--
  Created by IntelliJ IDEA.
  User: serge
  Date: 04.05.2023
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products</title>
</head>
<body>

<h2>Get By ID</h2>
<c:url value="/" var="var"/>
<form action="${var}" method="post">
  <label for="id">ID</label>
  <input type="text" name="id" id="id">
</form>

<h2>Products</h2>
<table>
  <tr>
    <th>id</th>
    <th>title</th>
    <th>cost</th>
  </tr>
  <c:forEach var="product" items="${productList}">
    <tr>
      <td>${product.id}</td>
      <td>${product.title}</td>
      <td>${product.cost}</td>
    </tr>
  </c:forEach>
</table>

<h2>Add Product</h2>
<c:url value="/addProduct" var="addProduct"/>
<a href="${addProduct}">Add new product</a>
</body>
</html>
